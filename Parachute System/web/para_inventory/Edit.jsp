<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Edit
    Created on : Jun 3, 2009, 10:51:45 AM
    Author     : Dell
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="Edit Parachute Inventory">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:table augmentTitle="false" id="table1" style="position: absolute; left: 24px; top: 72px" title="Parachute Inventory" width="0">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{para_inventory$Edit.para_inventoryDataProvider}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="type_prefix_no" id="tableColumn1">
                                    <webuijsf:dropDown converter="#{para_inventory$Edit.dropDown1Converter}" id="dropDown1"
                                        items="#{para_inventory$Edit.para_typeDataProvider.options['para_type.para_type_no,para_type.name']}" selected="#{currentRow.value['para_inventory.type_prefix_no']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="chute_no" id="tableColumn2" sort="para_inventory.chute_no">
                                    <webuijsf:textField id="textField1" required="true" text="#{currentRow.value['para_inventory.chute_no']}"/>
                                    <webuijsf:message for="textField1" id="message1" showDetail="false" showSummary="true"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="serial_no" id="tableColumn3" sort="para_inventory.serial_no">
                                    <webuijsf:textField id="textField2" required="true" text="#{currentRow.value['para_inventory.serial_no']}"/>
                                    <webuijsf:message for="textField2" id="message2" showDetail="false" showSummary="true"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="date_of_mfg" id="tableColumn4" sort="para_inventory.date_of_mfg">
                                    <webuijsf:textField id="textField4" required="true" text="#{currentRow.value['para_inventory.date_of_mfg']}"/>
                                    <webuijsf:message for="textField4" id="message3" showDetail="false" showSummary="true"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="no_of_jumps" id="tableColumn5" sort="para_inventory.no_of_jumps">
                                    <webuijsf:textField id="textField3" required="true" text="#{currentRow.value['para_inventory.no_of_jumps']}"/>
                                    <webuijsf:message for="textField3" id="message4" showDetail="false" showSummary="true"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="status" id="tableColumn6" sort="para_inventory.status">
                                    <webuijsf:dropDown id="dropDown2" items="#{para_inventory$Edit.statusDDDefaultOptions.options}" selected="#{currentRow.value['para_inventory.status']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:button actionExpression="#{para_inventory$Edit.save_action}" id="save" style="position: absolute; left: 24px; top: 48px" text="Save Changes"/>
                        <webuijsf:breadcrumbs id="breadcrumbs1" style="left: 14px; top: 14px; position: absolute">
                            <webuijsf:hyperlink id="hyperlink1" text="Page1" url="/"/>
                            <webuijsf:hyperlink id="hyperlink2" text="para_inventory/View" url="/faces/para_inventory/View.jsp"/>
                            <webuijsf:hyperlink id="hyperlink3" text="para_inventory/Edit" url="/faces/para_inventory/Edit.jsp"/>
                        </webuijsf:breadcrumbs>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
