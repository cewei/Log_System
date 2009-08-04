<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Return_page
    Created on : 27/07/2009, 12:08:53 PM
    Author     : user
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="Return Screen">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:breadcrumbs id="breadcrumbs1" style="left: 14px; top: 14px; position: absolute">
                            <webuijsf:hyperlink id="hyperlink1" text="Page1" url="/"/>
                            <webuijsf:hyperlink id="hyperlink2" text="return_module/Return_page" url="/faces/return_module/Return_page.jsp"/>
                        </webuijsf:breadcrumbs>
                        <webuijsf:table augmentTitle="false" id="table1" style="position: absolute; left: 24px; top: 120px" title="Parachute Loan" width="0">
                            <webuijsf:tableRowGroup binding="#{return_module$Return_page.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                selected="#{return_module$Return_page.selectedState}" sourceData="#{return_module$Return_page.para_inventory_viewDataProvider}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="Serial No" id="tableColumn2" sort="para_inventory_view.Serial No">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['para_inventory_view.Serial No']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Name" id="tableColumn3" sort="para_inventory_view.Name">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['para_inventory_view.Name']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Chute No" id="tableColumn4" sort="para_inventory_view.Chute No">
                                    <webuijsf:staticText id="staticText4" text="#{currentRow.value['para_inventory_view.Chute No']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Current Status" id="tableColumn10" sort="para_inventory_view.Current Status">
                                    <webuijsf:staticText id="staticText10" text="#{currentRow.value['para_inventory_view.Current Status']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn id="tableColumn13"
                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" selectId="checkbox1">
                                    <webuijsf:checkbox id="checkbox1" selected="#{return_module$Return_page.selected}" selectedValue="#{return_module$Return_page.selectedValue}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:button actionExpression="#{return_module$Return_page.button1_action}" id="button1"
                            style="position: absolute; left: 24px; top: 72px" text="Add Jump Drop"/>
                        <webuijsf:button actionExpression="#{return_module$Return_page.button2_action}" id="button2"
                            style="position: absolute; left: 144px; top: 72px" text="Returned Packed"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
