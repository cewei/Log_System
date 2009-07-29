<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Consolidated_Main
    Created on : 28/07/2009, 1:34:41 PM
    Author     : user
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="Consolidated Maintance">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:breadcrumbs id="breadcrumbs1" style="left: 14px; top: 14px; position: absolute">
                            <webuijsf:hyperlink id="hyperlink1" text="Page1" url="/"/>
                            <webuijsf:hyperlink id="hyperlink2" text="para_packing/Consolidated_Main" url="/faces/para_packing/Consolidated_Main.jsp"/>
                        </webuijsf:breadcrumbs>
                        <webuijsf:table augmentTitle="false" id="table1" style="position: absolute; left: 24px; top: 96px" title="Table" width="97%">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10"
                                sourceData="#{para_packing$Consolidated_Main.para_consolidated_viewDataProvider}" sourceVar="currentRow">
                                <webuijsf:tableColumn align="center" headerText="Name" id="tableColumn11" sort="para_consolidated_view.Name" valign="middle">
                                    <webuijsf:staticText id="staticText11" text="#{currentRow.value['para_consolidated_view.Name']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Chute No" id="tableColumn1" sort="para_consolidated_view.Chute No" valign="middle">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['para_consolidated_view.Chute No']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Inner No" id="tableColumn2" sort="para_consolidated_view.Inner No" valign="middle">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['para_consolidated_view.Inner No']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Date of MFG" id="tableColumn3" sort="para_consolidated_view.Date of MFG" valign="middle">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['para_consolidated_view.Date of MFG']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Inspection" id="tableColumn4" sort="para_consolidated_view.Inspection" valign="middle">
                                    <webuijsf:staticText id="staticText4" text="#{currentRow.value['para_consolidated_view.Inspection']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Repacking" id="tableColumn5" sort="para_consolidated_view.Repacking" valign="middle">
                                    <webuijsf:staticText id="staticText9" text="#{currentRow.value['para_consolidated_view.Repacking']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="J/D" id="tableColumn6" sort="para_consolidated_view.J/D" valign="middle">
                                    <webuijsf:staticText id="staticText5" text="#{currentRow.value['para_consolidated_view.J/D']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Date" id="tableColumn7" sort="para_consolidated_view.Date Packed" valign="middle">
                                    <webuijsf:staticText id="staticText6" text="#{currentRow.value['para_consolidated_view.Date Packed']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Packer" id="tableColumn8" sort="para_consolidated_view.Packer" valign="middle">
                                    <webuijsf:staticText id="staticText7" text="#{currentRow.value['para_consolidated_view.Packer']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Checker / Inspector" id="tableColumn9"
                                    sort="para_consolidated_view.Checker / Inspector" valign="middle">
                                    <webuijsf:staticText id="staticText8" text="#{currentRow.value['para_consolidated_view.Checker / Inspector']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:button actionExpression="#{para_packing$Consolidated_Main.update_action}" id="update"
                            style="position: absolute; left: 24px; top: 48px" text="Update"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
