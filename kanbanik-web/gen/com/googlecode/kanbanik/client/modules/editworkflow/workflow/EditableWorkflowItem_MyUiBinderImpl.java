package com.googlecode.kanbanik.client.modules.editworkflow.workflow;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class EditableWorkflowItem_MyUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.googlecode.kanbanik.client.modules.editworkflow.workflow.EditableWorkflowItem>, com.googlecode.kanbanik.client.modules.editworkflow.workflow.EditableWorkflowItem.MyUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<div id='{0}' style='border-style: solid; border-width: 1px; margin:5px 5px 5px 5px; align: right; width: 220px'> <span id='{1}'></span> <span id='{2}'></span> </div>")
    SafeHtml html1(String arg0, String arg1, String arg2);
     
  }

  Template template = GWT.create(Template.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.googlecode.kanbanik.client.modules.editworkflow.workflow.EditableWorkflowItem owner) {

    com.googlecode.kanbanik.client.modules.editworkflow.workflow.EditableWorkflowItem_MyUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.googlecode.kanbanik.client.modules.editworkflow.workflow.EditableWorkflowItem_MyUiBinderImpl_GenBundle) GWT.create(com.googlecode.kanbanik.client.modules.editworkflow.workflow.EditableWorkflowItem_MyUiBinderImpl_GenBundle.class);
    com.googlecode.kanbanik.client.modules.editworkflow.workflow.EditableWorkflowItem_MyUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.dom.client.DivElement mainDiv = null;
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Panel item = owner.item;
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.PushButton editButton = (com.google.gwt.user.client.ui.PushButton) GWT.create(com.google.gwt.user.client.ui.PushButton.class);
    com.google.gwt.user.client.ui.PushButton deleteButton = (com.google.gwt.user.client.ui.PushButton) GWT.create(com.google.gwt.user.client.ui.PushButton.class);
    com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel2 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template.html1(domId0, domId1, domId2).asString());

    item.setStyleName("" + style.workflowItemHeader() + "");
    editButton.setStyleName("imageButtonStyle");
    editButton.setText("Edit");
    editButton.setTitle("Edit");
    f_HorizontalPanel2.add(editButton);
    deleteButton.setStyleName("imageButtonStyle");
    deleteButton.setText("Delete");
    deleteButton.setTitle("Delete");
    f_HorizontalPanel2.add(deleteButton);
    f_HorizontalPanel2.setStyleName("" + style.workflowItemToolbar() + "");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    mainDiv = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    mainDiv.removeAttribute("id");
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(item, domId1Element);
    f_HTMLPanel1.addAndReplaceElement(f_HorizontalPanel2, domId2Element);


    owner.deleteButton = deleteButton;
    owner.editButton = editButton;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}