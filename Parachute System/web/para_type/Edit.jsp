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
                <webuijsf:head id="head1" title="Edit Parachute Type">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1" virtualFormsConfig="save | table1:tableRowGroup1:tableColumn2:textField1 table1:tableRowGroup1:tableColumn3:textField2 table1:tableRowGroup1:tableColumn4:textField3 table1:tableRowGroup1:tableColumn5:textField4 table1:tableRowGroup1:tableColumn6:textField5 | save">
                        <webuijsf:table augmentTitle="false" id="table1" style="left: 24px; top: 72px; position: absolute" title="Parachute Types" width="1050">
                            <webuijsf:tableRowGroup binding="#{para_type$Edit.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                sourceData="#{para_type$Edit.para_typeDataProvider}" sourceVar="currentRow">
                                <webuijsf:tableColumn align="center" headerText="Type No" id="tableColumn1" valign="middle">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['para_type.para_type_no']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Type Prefix" id="tableColumn2" valign="middle">
                                    <webuijsf:textField id="textField1" required="true" text="#{currentRow.value['para_type.type_prefix']}"/>
                                    <webuijsf:message for="textField1" id="message1" showDetail="false" showSummary="true"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Type Name" id="tableColumn3" valign="middle">
                                    <webuijsf:textField id="textField2" required="true" text="#{currentRow.value['para_type.name']}"/>
                                    <webuijsf:message for="textField2" id="message2" showDetail="false" showSummary="true"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Life Span (Yrs)" id="tableColumn4" valign="middle">
                                    <webuijsf:textField id="textField3" required="true" text="#{currentRow.value['para_type.life_span']}"/>
                                    <webuijsf:message for="textField3" id="message3" showDetail="false" showSummary="true"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Max No. Jumps" id="tableColumn5" valign="middle">
                                    <webuijsf:textField id="textField4" required="true" text="#{currentRow.value['para_type.max_jump']}"/>
                                    <webuijsf:message for="textField4" id="message4" showDetail="false" showSummary="true"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Repack Cycle (Months)" id="tableColumn6" valign="middle">
                                    <webuijsf:textField id="textField5" required="true" text="#{currentRow.value['para_type.repack_cycle']}"/>
                                    <webuijsf:message for="textField5" id="message5" showDetail="false" showSummary="true"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Reserve" id="tableColumn9" valign="middle">
                                    <webuijsf:checkbox id="checkbox3" selected="#{currentRow.value['para_type.reserve_chute']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Static" id="tableColumn8" valign="middle">
                                    <webuijsf:checkbox id="checkbox2" selected="#{currentRow.value['para_type.static']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:button actionExpression="#{para_type$Edit.save_action}" id="save" style="position: absolute; left: 24px; top: 48px" text="Save Changes"/>
                        <webuijsf:breadcrumbs id="breadcrumbs1" style="left: 14px; top: 14px; position: absolute">
                            <webuijsf:hyperlink id="hyperlink1" text="Page1" url="/"/>
                            <webuijsf:hyperlink id="hyperlink2" text="para_type/View" url="/faces/para_type/View.jsp"/>
                            <webuijsf:hyperlink id="hyperlink3" text="para_type/Edit" url="/faces/para_type/Edit.jsp"/>
                        </webuijsf:breadcrumbs>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
