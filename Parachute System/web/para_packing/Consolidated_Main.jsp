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
                <webuijsf:head id="head1">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:breadcrumbs id="breadcrumbs1" style="left: 14px; top: 14px; position: absolute">
                            <webuijsf:hyperlink id="hyperlink1" text="Page1" url="/"/>
                            <webuijsf:hyperlink id="hyperlink2" text="para_packing/Consolidated_Main" url="/faces/para_packing/Consolidated_Main.jsp"/>
                        </webuijsf:breadcrumbs>
                        <webuijsf:table augmentTitle="false" id="table1" style="position: absolute; left: 24px; top: 96px" title="Table" width="0">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10"
                                sourceData="#{para_packing$Consolidated_Main.para_consolidated_viewDataProvider}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="name" id="tableColumn1" sort="para_consolidated_view.name">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['para_consolidated_view.name']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="chute_no" id="tableColumn2" sort="para_consolidated_view.chute_no">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['para_consolidated_view.chute_no']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="inner_no" id="tableColumn3" sort="para_consolidated_view.inner_no">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['para_consolidated_view.inner_no']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="date_of_mfg" id="tableColumn4" sort="para_consolidated_view.date_of_mfg">
                                    <webuijsf:staticText id="staticText4" text="#{currentRow.value['para_consolidated_view.date_of_mfg']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="inspection" id="tableColumn5" sort="para_consolidated_view.inspection">
                                    <webuijsf:staticText id="staticText5" text="#{currentRow.value['para_consolidated_view.inspection']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="repacking" id="tableColumn6" sort="para_consolidated_view.repacking">
                                    <webuijsf:staticText id="staticText10" text="#{currentRow.value['para_consolidated_view.repacking']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="no_of_jumps" id="tableColumn7" sort="para_consolidated_view.no_of_jumps">
                                    <webuijsf:staticText id="staticText6" text="#{currentRow.value['para_consolidated_view.no_of_jumps']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="date_packed" id="tableColumn8" sort="para_consolidated_view.date_packed">
                                    <webuijsf:staticText id="staticText7" text="#{currentRow.value['para_consolidated_view.date_packed']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="pack_by" id="tableColumn9" sort="para_consolidated_view.pack_by">
                                    <webuijsf:staticText id="staticText8" text="#{currentRow.value['para_consolidated_view.pack_by']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="inspect_by" id="tableColumn10" sort="para_consolidated_view.inspect_by">
                                    <webuijsf:staticText id="staticText9" text="#{currentRow.value['para_consolidated_view.inspect_by']}"/>
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
