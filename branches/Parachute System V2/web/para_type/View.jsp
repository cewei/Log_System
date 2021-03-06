<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : View
    Created on : May 21, 2009, 11:44:14 AM
    Author     : Dell
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="View Parachute Type">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:button actionExpression="#{para_type$View.add_action}" id="add" style="left: 23px; top: 48px; position: absolute" text="Add new entry"/>
                        <webuijsf:button actionExpression="#{para_type$View.edit_action}" id="edit" style="position: absolute; left: 120px; top: 48px" text="Edit"/>
                        <webuijsf:table augmentTitle="false" id="table1" style="left: 24px; top: 72px; position: absolute" title="Parachute Types" width="100%">
                            <webuijsf:tableRowGroup binding="#{para_type$View.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                sourceData="#{para_type$View.para_typeDataProvider}" sourceVar="currentRow">
                                <webuijsf:tableColumn align="center" headerText="Type No" id="tableColumn1" valign="middle">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['para_type.para_type_no']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Type Prefix" id="tableColumn2" valign="middle">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['para_type.type_prefix']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Type Name" id="tableColumn3" valign="middle">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['para_type.name']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Life Span (Yrs)" id="tableColumn4" valign="middle">
                                    <webuijsf:staticText id="staticText4" text="#{currentRow.value['para_type.life_span']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Max No. Jumps" id="tableColumn5" valign="middle">
                                    <webuijsf:staticText id="staticText5" text="#{currentRow.value['para_type.max_jump']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Repack Cycle (Days)" id="tableColumn6" valign="middle">
                                    <webuijsf:staticText id="staticText6" text="#{currentRow.value['para_type.repack_cycle']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Reserve" id="tableColumn7" valign="middle">
                                    <webuijsf:staticText id="staticText7" text="#{currentRow.value['para_type.reserve']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Static" id="tableColumn8" valign="middle">
                                    <webuijsf:staticText id="staticText8" text="#{currentRow.value['para_type.static']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:breadcrumbs id="breadcrumbs1" style="left: 14px; top: 14px; position: absolute">
                            <webuijsf:hyperlink id="hyperlink1" text="Page1" url="/"/>
                            <webuijsf:hyperlink id="hyperlink2" text="para_type/View" url="/faces/para_type/View.jsp"/>
                        </webuijsf:breadcrumbs>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
