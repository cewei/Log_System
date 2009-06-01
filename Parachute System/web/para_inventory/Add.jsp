<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Add
    Created on : Jun 1, 2009, 9:19:01 AM
    Author     : Dell
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="Add Parachute Inventory">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="#{para_inventory$Add.form1}" id="form1" virtualFormsConfig="type | typeDD |">
                        <webuijsf:breadcrumbs id="breadcrumbs1" style="left: 14px; top: 14px; position: absolute">
                            <webuijsf:hyperlink id="hyperlink1" text="Page1" url="/"/>
                            <webuijsf:hyperlink id="hyperlink4" text="para_inventory/View" url="/faces/para_inventory/View.jsp"/>
                            <webuijsf:hyperlink id="hyperlink5" text="para_inventory/Add" url="/faces/para_inventory/Add.jsp"/>
                        </webuijsf:breadcrumbs>
                        <webuijsf:label for="typeDD" id="label1" style="left: 24px; top: 48px; position: absolute" text="Type Prefix"/>
                        <webuijsf:label for="chuteNoTF" id="label2" style="position: absolute; left: 24px; top: 72px" text="Chute No"/>
                        <webuijsf:label for="serialNoTF" id="label3" style="position: absolute; left: 24px; top: 96px" text="Serial No"/>
                        <webuijsf:label for="dateOfMfgCal" id="label4" style="position: absolute; left: 24px; top: 120px" text="Date of Manufacturing"/>
                        <webuijsf:label for="noOfJumpsTF" id="label5" style="position: absolute; left: 24px; top: 144px" text="No of Jumps"/>
                        <webuijsf:label id="label6" style="position: absolute; left: 24px; top: 168px" text="Status"/>
                        <webuijsf:dropDown binding="#{para_inventory$Add.typeDD}" converter="#{para_inventory$Add.typeDDConverter}" id="typeDD"
                            items="#{para_inventory$Add.para_typeDataProvider.options['para_type.para_type_no,para_type.name']}"
                            onChange="webui.suntheme4_2.common.timeoutSubmitForm(this.form, 'typeDD');" style="left: 168px; top: 48px; position: absolute" valueChangeListenerExpression="#{para_inventory$Add.typeDD_processValueChange}"/>
                        <webuijsf:textField binding="#{para_inventory$Add.chuteNoTF}" id="chuteNoTF" required="true" style="left: 168px; top: 72px; position: absolute"/>
                        <webuijsf:textField id="serialNoTF" required="true" style="left: 168px; top: 96px; position: absolute"/>
                        <webuijsf:calendar dateFormatPattern="dd-MM-yyyy" id="dateOfMfgCal" required="true" style="position: absolute; left: 168px; top: 120px"/>
                        <webuijsf:textField id="noOfJumpsTF" required="true" style="position: absolute; left: 168px; top: 144px"/>
                        <webuijsf:dropDown id="statusDD" items="#{para_inventory$Add.statusDDDefaultOptions.options}" style="position: absolute; left: 168px; top: 168px"/>
                        <webuijsf:table augmentTitle="false" id="table1" style="position: absolute; left: 24px; top: 240px" title="Parachute Inventory" width="0">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{para_inventory$Add.para_inventory_viewDataProvider}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="Type Prefix No" id="tableColumn1" sort="para_inventory_view.Type Prefix No">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['para_inventory_view.Type Prefix No']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Serial No" id="tableColumn2" sort="para_inventory_view.Serial No">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['para_inventory_view.Serial No']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Name" id="tableColumn3" sort="para_inventory_view.Name">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['para_inventory_view.Name']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Chute No" id="tableColumn4" sort="para_inventory_view.Chute No">
                                    <webuijsf:staticText id="staticText4" text="#{currentRow.value['para_inventory_view.Chute No']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Life Span" id="tableColumn5" sort="para_inventory_view.Life Span">
                                    <webuijsf:staticText id="staticText5" text="#{currentRow.value['para_inventory_view.Life Span']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Max Jumps" id="tableColumn6" sort="para_inventory_view.Max Jumps">
                                    <webuijsf:staticText id="staticText6" text="#{currentRow.value['para_inventory_view.Max Jumps']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Jumps Left" id="tableColumn7" sort="para_inventory_view.Jumps Left">
                                    <webuijsf:staticText id="staticText7" text="#{currentRow.value['para_inventory_view.Jumps Left']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Manufactured Date" id="tableColumn8" sort="para_inventory_view.Manufactured Date">
                                    <webuijsf:staticText id="staticText8" text="#{currentRow.value['para_inventory_view.Manufactured Date']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Replacement Date" id="tableColumn9" sort="para_inventory_view.Replacement Date">
                                    <webuijsf:staticText id="staticText9" text="#{currentRow.value['para_inventory_view.Replacement Date']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Current Status" id="tableColumn10" sort="para_inventory_view.Current Status">
                                    <webuijsf:staticText id="staticText10" text="#{currentRow.value['para_inventory_view.Current Status']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:button actionExpression="#{para_inventory$Add.add_action}" id="add" style="left: 23px; top: 192px; position: absolute" text="Add"/>
                        <webuijsf:messageGroup id="messageGroup1" style="position: absolute; left: 456px; top: 72px"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
