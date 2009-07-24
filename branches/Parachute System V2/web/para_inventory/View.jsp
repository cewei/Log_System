<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : View
    Created on : May 24, 2009, 10:01:35 PM
    Author     : Lancer-Matrix
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="View Parachute Inventory">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:button actionExpression="#{para_inventory$View.add_action}" id="add" style="position: absolute; left: 24px; top: 48px" text="Add new parachute"/>
                        <webuijsf:button actionExpression="#{para_inventory$View.edit_action}" id="edit" style="position: absolute; left: 144px; top: 48px" text="Edit"/>
                        <webuijsf:table augmentTitle="false" id="table1" style="position: absolute; left: 24px; top: 72px" title="Parachute Inventory" width="100%">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{para_inventory$View.para_inventory_viewDataProvider}" sourceVar="currentRow">
                                <webuijsf:tableColumn align="center" headerText="Serial No" id="tableColumn1" sort="para_inventory_view.Serial No" valign="middle">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['para_inventory_view.Serial No']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Name" id="tableColumn2" sort="para_inventory_view.Name" valign="middle">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['para_inventory_view.Name']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Chute No" id="tableColumn3" sort="para_inventory_view.Chute No" valign="middle">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['para_inventory_view.Chute No']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Life Span" id="tableColumn4" sort="para_inventory_view.Life Span" valign="middle">
                                    <webuijsf:staticText id="staticText4" text="#{currentRow.value['para_inventory_view.Life Span']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Max Jumps" id="tableColumn5" sort="para_inventory_view.Max Jumps" valign="middle">
                                    <webuijsf:staticText id="staticText5" text="#{currentRow.value['para_inventory_view.Max Jumps']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Jumps Left" id="tableColumn6" sort="para_inventory_view.Jumps Left" valign="middle">
                                    <webuijsf:staticText id="staticText6" text="#{currentRow.value['para_inventory_view.Jumps Left']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Manufactured Date" id="tableColumn7"
                                    sort="para_inventory_view.Manufactured Date" valign="middle">
                                    <webuijsf:staticText id="staticText7" text="#{currentRow.value['para_inventory_view.Manufactured Date']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Replacement Date" id="tableColumn8" sort="para_inventory_view.Replacement Date" valign="middle">
                                    <webuijsf:staticText id="staticText8" text="#{currentRow.value['para_inventory_view.Replacement Date']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Current Status" id="tableColumn9" sort="para_inventory_view.Current Status" valign="middle">
                                    <webuijsf:staticText id="staticText9" text="#{currentRow.value['para_inventory_view.Current Status']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:breadcrumbs id="breadcrumbs1" style="left: 14px; top: 14px; position: absolute">
                            <webuijsf:hyperlink id="hyperlink1" text="Page1" url="/"/>
                            <webuijsf:hyperlink id="hyperlink2" text="para_inventory/View" url="/faces/para_inventory/View.jsp"/>
                        </webuijsf:breadcrumbs>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
