<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : View
    Created on : Jun 10, 2009, 9:33:22 AM
    Author     : Dell
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="View Parachute Riggers">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:button actionExpression="#{para_riggers$View.add_action}" id="add" style="position: absolute; left: 24px; top: 48px" text="Add"/>
                        <webuijsf:button actionExpression="#{para_riggers$View.edit_action}" id="edit" style="position: absolute; left: 96px; top: 48px" text="Edit"/>
                        <webuijsf:table augmentTitle="false" id="table1" style="position: absolute; left: 24px; top: 72px" title="Riggers" width="100%">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{para_riggers$View.para_riggersDataProvider}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="NRIC" id="tableColumn1" sort="para_riggers.NRIC">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['para_riggers.NRIC']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="name" id="tableColumn2" sort="para_riggers.name">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['para_riggers.name']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="rank" id="tableColumn3" sort="para_riggers.rank">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['para_riggers.rank']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="rigger" id="tableColumn4" sort="para_riggers.rigger">
                                    <webuijsf:staticText id="staticText4" text="#{currentRow.value['para_riggers.rigger']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="inspector" id="tableColumn5" sort="para_riggers.inspector">
                                    <webuijsf:staticText id="staticText5" text="#{currentRow.value['para_riggers.inspector']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="last_refresher_date" id="tableColumn7" sort="para_riggers.last_refresher_date">
                                    <webuijsf:staticText id="staticText7" text="#{currentRow.value['para_riggers.last_refresher_date']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:breadcrumbs id="breadcrumbs1" style="left: 14px; top: 14px; position: absolute">
                            <webuijsf:hyperlink id="hyperlink1" text="Page1" url="/"/>
                            <webuijsf:hyperlink id="hyperlink2" text="para_riggers/View" url="/faces/para_riggers/View.jsp"/>
                        </webuijsf:breadcrumbs>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
