<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Edit
    Created on : Jun 18, 2009, 11:35:51 AM
    Author     : Dell
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="Edit Parachute Borrowers">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:breadcrumbs id="breadcrumbs1" style="left: 14px; top: 14px; position: absolute">
                            <webuijsf:hyperlink id="hyperlink1" text="Page1" url="/"/>
                            <webuijsf:hyperlink id="hyperlink2" text="para_borrowers/View" url="/faces/para_borrowers/View.jsp"/>
                            <webuijsf:hyperlink id="hyperlink3" text="para_borrowers/Edit" url="/faces/para_borrowers/Edit.jsp"/>
                        </webuijsf:breadcrumbs>
                        <webuijsf:table augmentTitle="false" id="table1" style="position: absolute; left: 24px; top: 72px" title="Borrowers" width="0">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{para_borrowers$Edit.para_borrowersDataProvider}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="NRIC" id="tableColumn1" sort="para_borrowers.NRIC">
                                    <webuijsf:textField id="textField1" required="true" text="#{currentRow.value['para_borrowers.NRIC']}"/>
                                    <webuijsf:message for="textField1" id="message1" showDetail="false" showSummary="true"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="name" id="tableColumn2" sort="para_borrowers.name">
                                    <webuijsf:textField id="textField2" required="true" text="#{currentRow.value['para_borrowers.name']}"/>
                                    <webuijsf:message for="textField2" id="message2" showDetail="false" showSummary="true"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="rank" id="tableColumn3" sort="para_borrowers.rank">
                                    <webuijsf:textField id="textField3" required="true" text="#{currentRow.value['para_borrowers.rank']}"/>
                                    <webuijsf:message for="textField3" id="message3" showDetail="false" showSummary="true"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="unit" id="tableColumn4" sort="para_borrowers.unit">
                                    <webuijsf:textField id="textField4" required="true" text="#{currentRow.value['para_borrowers.unit']}"/>
                                    <webuijsf:message for="textField4" id="message4" showDetail="false" showSummary="true"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:button actionExpression="#{para_borrowers$Edit.save_action}" id="save" style="position: absolute; left: 24px; top: 48px" text="Save Changes"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
