package com.googlecode.kanbanik.commands

import com.googlecode.kanbanik.model.User
import com.googlecode.kanbanik.security._
import org.bson.types.ObjectId
import com.googlecode.kanbanik.builders.ProjectBuilder
import com.googlecode.kanbanik.messages.ServerMessages
import com.googlecode.kanbanik.model.validation.ProjectValidation
import com.googlecode.kanbanik.db.HasEntityLoader
import com.googlecode.kanbanik.dtos._

class DeleteProjectCommand extends Command[ProjectDto, EmptyDto] with ProjectValidation with HasEntityLoader {

  lazy val projectBuilder = new ProjectBuilder

  override def execute(params: ProjectDto, user: User): Either[EmptyDto, ErrorDto] = {

    if (!params.id.isDefined) {
      return Right(ErrorDto("The ID of the project has to be set"))
    }

    loadProject(new ObjectId(params.id.get), user).getOrElse(return Right(ErrorDto(ServerMessages.entityDeletedMessage("project"))))
    
    val project = projectBuilder.buildEntity(params)
    
    val (deletable, msg) = canBeDeleted(project, user)
    if (!deletable) {
    	return Right(ErrorDto(msg))
    }

    project.delete()

    Left(EmptyDto())
  }

  override def checkPermissions(param: ProjectDto, user: User): Option[List[String]] =
    checkIdIfDefined(user, param.id, PermissionType.DeleteProject)
}