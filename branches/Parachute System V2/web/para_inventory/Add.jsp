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
                        <webuijsf:textField binding="#{para_inventory$Add.serialNoTF}" id="serialNoTF" required="true" style="left: 168px; top: 96px; position: absolute"/>
                        <webuijsf:calendar binding="#{para_inventory$Add.dateOfMfgCal}" dateFormatPattern="dd-MM-yyyy" id="dateOfMfgCal" required="true" style="position: absolute; left: 168px; top: 120px"/>
                        <webuijsf:textField binding="#{para_inventory$Add.noOfJumpsTF}" id="noOfJumpsTF" required="true" style="position: absolute; left: 168px; top: 144px"/>
                        <webuijsf:dropDown binding="#{para_inventory$Add.statusDD}" id="statusDD" items="#{para_inventory$Add.statusDDDefaultOptions.options}" style="position: absolute; left: 168px; top: 168px"/>
                        <webuijsf:button actionExpression="#{para_inventory$Add.add_action}" id="add" style="left: 23px; top: 192px; position: absolute" text="Add"/>
                        <webuijsf:table augmentTitle="false" id="table1" style="position: absolute; left: 24px; top: 240px" title="Parachute Inventory" width="100%">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{para_inventory$Add.para_inventory_viewDataProvider}" sourceVar="currentRow">
                                <webuijsf:tableColumn align="center" headerText="Type Prefix No" id="tableColumn1" sort="para_inventory_view.Type Prefix No" valign="middle">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['para_inventory_view.Type Prefix No']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Serial No" id="tableColumn2" sort="para_inventory_view.Serial No" valign="middle">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['para_inventory_view.Serial No']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Name" id="tableColumn3" sort="para_inventory_view.Name" valign="middle">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['para_inventory_view.Name']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Chute No" id="tableColumn4" sort="para_inventory_view.Chute No" valign="middle">
                                    <webuijsf:staticText id="staticText4" text="#{currentRow.value['para_inventory_view.Chute No']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Life Span" id="tableColumn5" sort="para_inventory_view.Life Span" valign="middle">
                                    <webuijsf:staticText id="staticText5" text="#{currentRow.value['para_inventory_view.Life Span']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Max Jumps" id="tableColumn6" sort="para_inventory_view.Max Jumps" valign="middle">
                                    <webuijsf:staticText id="staticText6" text="#{currentRow.value['para_inventory_view.Max Jumps']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Jumps Left" id="tableColumn7" sort="para_inventory_view.Jumps Left" valign="middle">
                                    <webuijsf:staticText id="staticText7" text="#{currentRow.value['para_inventory_view.Jumps Left']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Manufactured Date" id="tableColumn8"
                                    sort="para_inventory_view.Manufactured Date" valign="middle">
                                    <webuijsf:staticText id="staticText8" text="#{currentRow.value['para_inventory_view.Manufactured Date']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Replacement Date" id="tableColumn9" sort="para_inventory_view.Replacement Date" valign="middle">
                                    <webuijsf:staticText id="staticText9" text="#{currentRow.value['para_inventory_view.Replacement Date']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Current Status" id="tableColumn10" sort="para_inventory_view.Current Status" valign="middle">
                                    <webuijsf:staticText id="staticText10" text="#{currentRow.value['para_inventory_view.Current Status']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:breadcrumbs id="breadcrumbs1" style="left: 14px; top: 14px; position: absolute">
                            <webuijsf:hyperlink id="hyperlink1" text="Page1" url="/"/>
                            <webuijsf:hyperlink id="hyperlink2" text="para_inventory/View" url="/faces/para_inventory/View.jsp"/>
                            <webuijsf:hyperlink id="hyperlink3" text="para_inventory/Add" url="/faces/para_inventory/Add.jsp"/>
                        </webuijsf:breadcrumbs>
                        <webuijsf:messageGroup id="messageGroup1" showGlobalOnly="true" style="left: 456px; top: 48px; position: absolute"/>
                        <webuijsf:message for="chuteNoTF" id="message1" showDetail="false" showSummary="true" style="left: 336px; top: 72px; position: absolute"/>
                        <webuijsf:message for="serialNoTF" id="message2" showDetail="false" showSummary="true" style="left: 336px; top: 96px; position: absolute"/>
                        <webuijsf:message for="dateOfMfgCal" id="message3" showDetail="false" showSummary="true" style="left: 336px; top: 120px; position: absolute"/>
                        <webuijsf:message for="noOfJumpsTF" id="message4" showDetail="false" showSummary="true" style="left: 336px; top: 144px; position: absolute"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
