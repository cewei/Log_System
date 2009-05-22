<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Edit
    Created on : May 22, 2009, 10:00:09 AM
    Author     : Dell
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1" virtualFormsConfig="save | typePrefixText repackCycleText maxJumpText lifeSpanText nameText | typePrefixText repackCycleText maxJumpText lifeSpanText nameText">
                        <webuijsf:breadcrumbs id="breadcrumbs1" style="left: 14px; top: 14px; position: absolute">
                            <webuijsf:hyperlink actionExpression="#{para_type$Edit.hyperlink1_action}" id="hyperlink1" text="para_type/Add" url="/faces/para_type/Add.jsp"/>
                            <webuijsf:hyperlink actionExpression="#{para_type$Edit.hyperlink2_action}" id="hyperlink2" text="para_type/View" url="/faces/para_type/View.jsp"/>
                            <webuijsf:hyperlink actionExpression="#{para_type$Edit.hyperlink3_action}" id="hyperlink3" text="para_type/Edit" url="/faces/para_type/Edit.jsp"/>
                        </webuijsf:breadcrumbs>
                        <webuijsf:label for="typePrefixText" id="typePrefixLbl" style="left: 25px; top: 48px; position: absolute" text="Type Prefix"/>
                        <webuijsf:label for="nameText" id="nameLbl" style="left: 24px; top: 72px; position: absolute" text="Name"/>
                        <webuijsf:label for="lifeSpanText" id="lifeSpanLbl" style="left: 24px; top: 96px; position: absolute" text="Life Span"/>
                        <webuijsf:label for="maxJumpText" id="maxJumpLbl" style="left: 24px; top: 120px; position: absolute" text="Max Jump"/>
                        <webuijsf:label for="repackCycleText" id="repackCycleLbl" style="left: 24px; top: 144px; position: absolute" text="Repack Cycle"/>
                        <webuijsf:textField binding="#{para_type$Edit.typePrefixText}" id="typePrefixText" required="true"
                            style="left: 121px; top: 48px; position: absolute" text="#{para_type$Edit.para_typeDataProvider.value['para_type.type_prefix']}"/>
                        <webuijsf:textField binding="#{para_type$Edit.nameText}" id="nameText" required="true"
                            style="left: 120px; top: 72px; position: absolute" text="#{para_type$Edit.para_typeDataProvider.value['para_type.name']}"/>
                        <webuijsf:textField binding="#{para_type$Edit.lifeSpanText}" id="lifeSpanText" required="true"
                            style="left: 120px; top: 96px; position: absolute" text="#{para_type$Edit.para_typeDataProvider.value['para_type.life_span']}"/>
                        <webuijsf:textField binding="#{para_type$Edit.maxJumpText}" id="maxJumpText" required="true"
                            style="left: 120px; top: 120px; position: absolute" text="#{para_type$Edit.para_typeDataProvider.value['para_type.max_jump']}"/>
                        <webuijsf:textField binding="#{para_type$Edit.repackCycleText}" id="repackCycleText" required="true"
                            style="left: 120px; top: 144px; position: absolute" text="#{para_type$Edit.para_typeDataProvider.value['para_type.repack_cycle']}"/>
                        <webuijsf:button actionExpression="#{para_type$Edit.edit_action}" id="edit" style="left: 23px; top: 192px; position: absolute" text="edit"/>
                        <webuijsf:messageGroup id="messageGroup1" style="left: 288px; top: 48px; position: absolute"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
