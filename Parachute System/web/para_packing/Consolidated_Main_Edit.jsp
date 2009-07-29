<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Consolidated_Main_Edit
    Created on : 28/07/2009, 1:55:27 PM
    Author     : user
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="Consolidated Maintance Edit">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:breadcrumbs id="breadcrumbs1" style="left: 14px; top: 14px; position: absolute">
                            <webuijsf:hyperlink id="hyperlink1" text="Page1" url="/"/>
                            <webuijsf:hyperlink id="hyperlink2" text="para_packing/Consolidated_Main" url="/faces/para_packing/Consolidated_Main.jsp"/>
                            <webuijsf:hyperlink id="hyperlink3" text="para_packing/Consolidated_Main_Edit" url="/faces/para_packing/Consolidated_Main_Edit.jsp"/>
                        </webuijsf:breadcrumbs>
                        <webuijsf:table augmentTitle="false" id="table1" style="left: 24px; top: 192px; position: absolute; width: 0px" title="Table" width="0">
                            <webuijsf:tableRowGroup binding="#{para_packing$Consolidated_Main_Edit.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                selected="#{para_packing$Consolidated_Main_Edit.selectedState}"
                                sourceData="#{para_packing$Consolidated_Main_Edit.para_inventoryDataProvider}" sourceVar="currentRow">
                                <webuijsf:tableColumn align="center" headerText="Type Prefix" id="tableColumn1" valign="middle">
                                    <webuijsf:dropDown converter="#{para_packing$Consolidated_Main_Edit.dropDown1Converter}" disabled="true" id="dropDown1"
                                        items="#{para_packing$Consolidated_Main_Edit.para_typeDataProvider.options['para_type.para_type_no,para_type.type_prefix']}" selected="#{currentRow.value['para_inventory.type_prefix_no']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Chute No" id="tableColumn2" sort="para_inventory.chute_no">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['para_inventory.chute_no']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Serial No" id="tableColumn3" sort="para_inventory.serial_no">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['para_inventory.serial_no']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Date of MFG" id="tableColumn4" sort="para_inventory.date_of_mfg">
                                    <webuijsf:staticText id="staticText4" text="#{currentRow.value['para_inventory.date_of_mfg']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="J/D" id="tableColumn5" sort="para_inventory.no_of_jumps">
                                    <webuijsf:textField id="textField2" text="#{currentRow.value['para_inventory.no_of_jumps']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Date Packed" id="tableColumn6" sort="para_inventory.date_packed">
                                    <webuijsf:staticText id="staticText6" text="#{currentRow.value['para_inventory.date_packed']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Status" id="tableColumn7" sort="para_inventory.status">
                                    <webuijsf:staticText id="staticText7" text="#{currentRow.value['para_inventory.status']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" id="tableRowGroup1SelectionColumn"
                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);"
                                    selectId="tableRowGroup1SelectionChild" valign="middle">
                                    <webuijsf:checkbox id="tableRowGroup1SelectionChild" selected="#{para_packing$Consolidated_Main_Edit.selected}" selectedValue="#{para_packing$Consolidated_Main_Edit.selectedValue}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Inner No" id="tableColumn8">
                                    <webuijsf:textField binding="#{para_packing$Consolidated_Main_Edit.textField3}" id="textField3" text=" "/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:calendar binding="#{para_packing$Consolidated_Main_Edit.dateCal}" dateFormatPattern="dd-MM-yyyy" id="dateCal" label="Date"
                            required="true" style="left: 168px; top: 48px; position: absolute"/>
                        <webuijsf:dropDown binding="#{para_packing$Consolidated_Main_Edit.packerDD}" id="packerDD"
                            items="#{para_packing$Consolidated_Main_Edit.para_riggersDataProvider.options['para_riggers.name,para_riggers.name']}"
                            label="Packer" style="left: 24px; top: 120px; position: absolute"/>
                        <webuijsf:dropDown binding="#{para_packing$Consolidated_Main_Edit.inspectorDD}" id="inspectorDD"
                            items="#{para_packing$Consolidated_Main_Edit.para_riggersDataProvider1.options['para_riggers.name,para_riggers.name']}"
                            label="Inspector" style="left: 408px; top: 120px; position: absolute"/>
                        <webuijsf:button actionExpression="#{para_packing$Consolidated_Main_Edit.save_action}" id="save"
                            style="left: 23px; top: 168px; position: absolute" text="Save Changes"/>
                        <webuijsf:dropDown binding="#{para_packing$Consolidated_Main_Edit.inspectionDD}" id="inspectionDD"
                            items="#{para_packing$Consolidated_Main_Edit.inspectionDDDefaultOptions.options}" label="Type of Inspection" style="left: 408px; top: 48px; position: absolute"/>
                        <webuijsf:radioButtonGroup binding="#{para_packing$Consolidated_Main_Edit.radioButtonGroup1}" id="radioButtonGroup1"
                            items="#{para_packing$Consolidated_Main_Edit.radioButtonGroup1DefaultOptions.options}" required="true" style="left: 24px; top: 48px; position: absolute"/>
                        <webuijsf:dropDown binding="#{para_packing$Consolidated_Main_Edit.checkerDD}" id="checkerDD"
                            items="#{para_packing$Consolidated_Main_Edit.para_riggersDataProvider1.options['para_riggers.name,para_riggers.name']}"
                            label="Checker" style="left: 216px; top: 120px; position: absolute"/>
                        <webuijsf:dropDown binding="#{para_packing$Consolidated_Main_Edit.followUpDD}" id="followUpDD"
                            items="#{para_packing$Consolidated_Main_Edit.followUpDDDefaultOptions.options}" label="Follow Up" style="left: 672px; top: 48px; position: absolute"/>
                        <webuijsf:message for="radioButtonGroup1" id="message1" showDetail="false" showSummary="true" style="left: 144px; top: 72px; position: absolute"/>
                        <webuijsf:messageGroup id="messageGroup1" showGlobalOnly="true" style="position: absolute; left: 840px; top: 48px"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
