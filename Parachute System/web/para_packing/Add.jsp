<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Add
    Created on : Jun 22, 2009, 2:35:12 PM
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
                    <webuijsf:form id="form1">
                        <webuijsf:breadcrumbs id="breadcrumbs1" style="left: 14px; top: 14px; position: absolute">
                            <webuijsf:hyperlink id="hyperlink1" text="Page1" url="/"/>
                            <webuijsf:hyperlink id="hyperlink2" text="para_packing/View" url="/faces/para_packing/View.jsp"/>
                            <webuijsf:hyperlink id="hyperlink3" text="para_packing/Add" url="/faces/para_packing/Add.jsp"/>
                        </webuijsf:breadcrumbs>
                        <webuijsf:label for="repackDateCal" id="label1" style="left: 24px; top: 72px; position: absolute" text="Repacked Date"/>
                        <webuijsf:label for="packByDD" id="label2" style="left: 24px; top: 96px; position: absolute" text="Packed By"/>
                        <webuijsf:label for="inspectByDD" id="label3" style="left: 24px; top: 120px; position: absolute" text="Inspected By"/>
                        <webuijsf:label for="checkTypeDD" id="label4" style="left: 24px; top: 144px; position: absolute" text="Check Type"/>
                        <webuijsf:label for="statusDD" id="label5" style="left: 24px; top: 168px; position: absolute" text="Status"/>
                        <webuijsf:calendar binding="#{para_packing$Add.repackDateCal}" dateFormatPattern="dd-MM-yyyy" id="repackDateCal" required="true" style="left: 120px; top: 72px; position: absolute"/>
                        <webuijsf:dropDown binding="#{para_packing$Add.packByDD}" id="packByDD"
                            items="#{para_packing$Add.para_riggersDataProvider.options['para_riggers.NRIC,para_riggers.NRIC']}" style="left: 120px; top: 96px; position: absolute"/>
                        <webuijsf:dropDown binding="#{para_packing$Add.inspectByDD}" id="inspectByDD"
                            items="#{para_packing$Add.para_riggersDataProvider1.options['para_riggers.NRIC,para_riggers.NRIC']}" style="left: 120px; top: 120px; position: absolute"/>
                        <webuijsf:dropDown binding="#{para_packing$Add.checkTypeDD}" id="checkTypeDD"
                            items="#{para_packing$Add.checkTypeDDDefaultOptions.options}" style="left: 120px; top: 144px; position: absolute"/>
                        <webuijsf:dropDown binding="#{para_packing$Add.statusDD}" id="statusDD" items="#{para_packing$Add.statusDDDefaultOptions.options}" style="left: 120px; top: 168px; position: absolute"/>
                        <webuijsf:table augmentTitle="false" id="table1" style="position: absolute; left: 24px; top: 192px" title="Parachute Packing" width="0">
                            <webuijsf:tableRowGroup binding="#{para_packing$Add.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                selected="#{para_packing$Add.selectedState}" sourceData="#{para_packing$Add.para_packing_viewDataProvider}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="Serial No" id="tableColumn1" sort="para_inventory.Serial No" align="center" valign="middle">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['para_inventory.Serial No']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Chute No" id="tableColumn2" sort="Chute No" align="center" valign="middle">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['Chute No']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Repacked Date" id="tableColumn3" sort="para_packing.Repacked Date" align="center" valign="middle">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['para_packing.Repacked Date']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Repack Due Date" id="tableColumn4" sort="Repack Due Date" align="center" valign="middle">
                                    <webuijsf:staticText id="staticText4" text="#{currentRow.value['Repack Due Date']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Pack By" id="tableColumn5" sort="para_packing.Pack By" align="center" valign="middle">
                                    <webuijsf:staticText id="staticText5" text="#{currentRow.value['para_packing.Pack By']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Inspect By" id="tableColumn6" sort="para_packing.Inspect By" align="center" valign="middle">
                                    <webuijsf:staticText id="staticText6" text="#{currentRow.value['para_packing.Inspect By']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Check Type" id="tableColumn7" sort="para_packing.Check Type" align="center" valign="middle">
                                    <webuijsf:staticText id="staticText7" text="#{currentRow.value['para_packing.Check Type']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Status" id="tableColumn8" sort="para_inventory.Status" align="center" valign="middle">
                                    <webuijsf:staticText id="staticText8" text="#{currentRow.value['para_inventory.Status']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn id="tableRowGroup1SelectionColumn"
                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" selectId="tableRowGroup1SelectionChild" align="center" valign="middle">
                                    <webuijsf:checkbox id="tableRowGroup1SelectionChild" selected="#{para_packing$Add.selected}" selectedValue="#{para_packing$Add.selectedValue}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:button actionExpression="#{para_packing$Add.save_action}" id="save" style="position: absolute; left: 24px; top: 48px" text="Save"/>
                        <webuijsf:message for="repackDateCal" id="message1" showDetail="false" showSummary="true" style="position: absolute; left: 288px; top: 72px"/>
                        <webuijsf:messageGroup id="messageGroup1" showGlobalOnly="true" style="left: 336px; top: 48px; position: absolute"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
