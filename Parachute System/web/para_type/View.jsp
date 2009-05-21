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
                        <webuijsf:table augmentTitle="false" id="table1" style="left: 24px; top: 72px; position: absolute; width: 0px" title="Parachute Types" width="0">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{para_type$View.para_typeDataProvider}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="para_type_no" id="tableColumn1" sort="para_type.para_type_no">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['para_type.para_type_no']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="type_prefix" id="tableColumn2" sort="para_type.type_prefix">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['para_type.type_prefix']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="name" id="tableColumn3" sort="para_type.name">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['para_type.name']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="life_span" id="tableColumn4" sort="para_type.life_span">
                                    <webuijsf:staticText id="staticText4" text="#{currentRow.value['para_type.life_span']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="max_jump" id="tableColumn5" sort="para_type.max_jump">
                                    <webuijsf:staticText id="staticText5" text="#{currentRow.value['para_type.max_jump']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="repack_cycle" id="tableColumn6" sort="para_type.repack_cycle">
                                    <webuijsf:staticText id="staticText6" text="#{currentRow.value['para_type.repack_cycle']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:button actionExpression="#{para_type$View.add_action}" id="add" style="position: absolute; left: 24px; top: 24px" text="Add new entry"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
