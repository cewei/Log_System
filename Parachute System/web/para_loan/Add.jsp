<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Add
    Created on : Jun 12, 2009, 2:45:07 PM
    Author     : Dell
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="Add Parachute Loan">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1" virtualFormsConfig="">
                        <webuijsf:label id="label1" style="left: 24px; top: 72px; position: absolute" text="NRIC"/>
                        <webuijsf:label id="label2" style="position: absolute; left: 24px; top: 96px" text="Name"/>
                        <webuijsf:label id="label3" style="position: absolute; left: 24px; top: 120px" text="Unit"/>
                        <webuijsf:dropDown binding="#{para_loan$Add.nricDD}" id="nricDD"
                            items="#{para_loan$Add.para_borrowersDataProvider.options['para_borrowers.NRIC,para_borrowers.NRIC']}"
                            onChange="webui.suntheme4_2.common.timeoutSubmitForm(this.form, 'nricDD');" style="position: absolute; left: 72px; top: 72px" valueChangeListenerExpression="#{para_loan$Add.nricDD_processValueChange}"/>
                        <webuijsf:staticText binding="#{para_loan$Add.nameST}" id="nameST" style="position: absolute; left: 72px; top: 96px"/>
                        <webuijsf:staticText binding="#{para_loan$Add.unitST}" id="unitST" style="left: 72px; top: 120px; position: absolute"/>
                        <webuijsf:label id="label4" style="position: absolute; left: 24px; top: 144px" text="Date Loan"/>
                        <webuijsf:calendar dateFormatPattern="dd-MM-yyyy" id="calendar1" style="left: 72px; top: 144px; position: absolute"/>
                        <webuijsf:table augmentTitle="false" deselectMultipleButton="true" id="table1" selectMultipleButton="true"
                            style="left: 24px; top: 192px; position: absolute; width: 0px" title="Inventory List" width="0">
                            <webuijsf:tableRowGroup binding="#{para_loan$Add.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                selected="#{para_loan$Add.selectedState}" sourceData="#{para_loan$Add.para_inventoryDataProvider}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="type_prefix_no" id="tableColumn1" sort="para_inventory.type_prefix_no">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['para_inventory.type_prefix_no']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="chute_no" id="tableColumn2" sort="para_inventory.chute_no">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['para_inventory.chute_no']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="serial_no" id="tableColumn3" sort="para_inventory.serial_no">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['para_inventory.serial_no']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="date_of_mfg" id="tableColumn4" sort="para_inventory.date_of_mfg">
                                    <webuijsf:staticText id="staticText4" text="#{currentRow.value['para_inventory.date_of_mfg']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="no_of_jumps" id="tableColumn5" sort="para_inventory.no_of_jumps">
                                    <webuijsf:staticText id="staticText5" text="#{currentRow.value['para_inventory.no_of_jumps']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="status" id="tableColumn6" sort="para_inventory.status">
                                    <webuijsf:staticText id="staticText6" text="#{currentRow.value['para_inventory.status']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn id="tableRowGroup1SelectionColumn"
                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" selectId="tableRowGroup1SelectionChild">
                                    <webuijsf:checkbox id="tableRowGroup1SelectionChild" selected="#{para_loan$Add.selected}" selectedValue="#{para_loan$Add.selectedValue}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:button actionExpression="#{para_loan$Add.loan_action}" id="loan" style="position: absolute; left: 24px; top: 48px" text="Loan"/>
                        <webuijsf:breadcrumbs id="breadcrumbs1" style="left: 14px; top: 14px; position: absolute">
                            <webuijsf:hyperlink id="hyperlink1" text="Page1" url="/"/>
                            <webuijsf:hyperlink id="hyperlink2" text="para_loan/View" url="/faces/para_loan/View.jsp"/>
                            <webuijsf:hyperlink id="hyperlink3" text="para_loan/Add" url="/faces/para_loan/Add.jsp"/>
                        </webuijsf:breadcrumbs>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
