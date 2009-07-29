<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : View_PackDue
    Created on : 28/07/2009, 10:32:10 AM
    Author     : user
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="Pack Due Date Record">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:breadcrumbs id="breadcrumbs1" style="left: 14px; top: 14px; position: absolute">
                            <webuijsf:hyperlink id="hyperlink1" text="Page1" url="/"/>
                            <webuijsf:hyperlink id="hyperlink2" text="para_packing/View_PackDue" url="/faces/para_packing/View_PackDue.jsp"/>
                        </webuijsf:breadcrumbs>
                        <webuijsf:table augmentTitle="false" id="table1" style="position: absolute; left: 24px; top: 72px" title="Parachute Pack Due Date" width="0">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{para_packing$View_PackDue.para_inventory_viewDataProvider}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="Name" id="tableColumn3" sort="para_inventory_view.Name">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['para_inventory_view.Name']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Chute No" id="tableColumn4" sort="para_inventory_view.Chute No">
                                    <webuijsf:staticText id="staticText4" text="#{currentRow.value['para_inventory_view.Chute No']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="J/D" id="tableColumn1" sort="para_inventory_view.J/D" valign="middle">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['para_inventory_view.J/D']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Packed date" id="tableColumn14" sort="para_inventory_view.Packed date">
                                    <webuijsf:staticText id="staticText12" text="#{currentRow.value['para_inventory_view.Packed date']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Packing Due Date" id="tableColumn15" sort="para_inventory_view.Packing Due Date">
                                    <webuijsf:staticText id="staticText13" text="#{currentRow.value['para_inventory_view.Packing Due Date']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Current Status" id="tableColumn10" sort="para_inventory_view.Current Status">
                                    <webuijsf:staticText id="staticText10" text="#{currentRow.value['para_inventory_view.Current Status']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:button actionExpression="#{para_packing$View_PackDue.edit_action}" id="edit" style="position: absolute; left: 24px; top: 48px" text="Edit"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
