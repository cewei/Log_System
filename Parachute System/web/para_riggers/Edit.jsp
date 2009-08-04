<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Edit
    Created on : Jun 11, 2009, 1:18:08 PM
    Author     : Dell
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="Edit Parachute Riggers">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:table augmentTitle="false" id="table1" selectMultipleButton="true" style="left: 24px; top: 96px; position: absolute"
                            title="Parachute Riggers" width="97%">
                            <webuijsf:tableRowGroup binding="#{para_riggers$Edit.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                selected="#{para_riggers$Edit.selectedState}" sourceData="#{para_riggers$Edit.para_riggersDataProvider}" sourceVar="currentRow">
                                <webuijsf:tableColumn align="center" headerText="NRIC" id="tableColumn1" sort="para_riggers.NRIC" valign="middle">
                                    <webuijsf:textField id="textField1" required="true" text="#{currentRow.value['para_riggers.NRIC']}"/>
                                    <webuijsf:message for="textField1" id="message1" showDetail="false" showSummary="true"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Name" id="tableColumn2" sort="para_riggers.name" valign="middle">
                                    <webuijsf:textField id="textField2" required="true" text="#{currentRow.value['para_riggers.name']}"/>
                                    <webuijsf:message for="textField2" id="message2" showDetail="false" showSummary="true"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Rank" id="tableColumn3" sort="para_riggers.rank" valign="middle">
                                    <webuijsf:textField id="textField3" required="true" text="#{currentRow.value['para_riggers.rank']}"/>
                                    <webuijsf:message for="textField3" id="message3" showDetail="false" showSummary="true"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Packer" id="tableColumn4" sort="para_riggers.rigger" valign="middle">
                                    <webuijsf:checkbox id="checkbox1" selected="#{currentRow.value['para_riggers.rigger']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Checker" id="tableColumn7" sort="para_riggers.checker" valign="middle">
                                    <webuijsf:checkbox id="checkbox3" selected="#{currentRow.value['para_riggers.checker']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Inspector" id="tableColumn5" sort="para_riggers.inspector" valign="middle">
                                    <webuijsf:checkbox id="checkbox2" selected="#{currentRow.value['para_riggers.inspector']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Last Refresher Date" id="tableColumn6" sort="para_riggers.last_refresher_date" valign="middle">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['para_riggers.last_refresher_date']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn id="tableRowGroup1SelectionColumn"
                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" selectId="tableRowGroup1SelectionChild">
                                    <webuijsf:checkbox id="tableRowGroup1SelectionChild" selected="#{para_riggers$Edit.selected}" selectedValue="#{para_riggers$Edit.selectedValue}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:button actionExpression="#{para_riggers$Edit.save_action}" id="save" style="position: absolute; left: 24px; top: 48px" text="Save Changes"/>
                        <webuijsf:breadcrumbs id="breadcrumbs1" style="left: 14px; top: 14px; position: absolute">
                            <webuijsf:hyperlink id="hyperlink1" text="Page1" url="/"/>
                            <webuijsf:hyperlink id="hyperlink2" text="para_riggers/View" url="/faces/para_riggers/View.jsp"/>
                            <webuijsf:hyperlink id="hyperlink3" text="para_riggers/Edit" url="/faces/para_riggers/Edit.jsp"/>
                        </webuijsf:breadcrumbs>
                        <webuijsf:calendar binding="#{para_riggers$Edit.calendar1}" dateFormatPattern="dd-MM-yyyy" id="calendar1" label="Refresher Date"
                            required="true" style="position: absolute; left: 24px; top: 72px"/>
                        <webuijsf:message for="calendar1" id="message4" showDetail="false" showSummary="true" style="position: absolute; left: 312px; top: 72px"/>
                        <webuijsf:messageGroup id="messageGroup1" showGlobalOnly="true" style="position: absolute; left: 504px; top: 24px"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
