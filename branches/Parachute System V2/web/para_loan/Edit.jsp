<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Edit
    Created on : Jun 18, 2009, 4:56:35 PM
    Author     : Dell
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="Edit Parachute Loan">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:breadcrumbs id="breadcrumbs1" style="left: 14px; top: 14px; position: absolute">
                            <webuijsf:hyperlink id="hyperlink1" text="Page1" url="/"/>
                            <webuijsf:hyperlink id="hyperlink2" text="para_loan/View" url="/faces/para_loan/View.jsp"/>
                            <webuijsf:hyperlink id="hyperlink3" text="para_loan/Edit" url="/faces/para_loan/Edit.jsp"/>
                        </webuijsf:breadcrumbs>
                        <webuijsf:table augmentTitle="false" id="table1" style="position: absolute; left: 24px; top: 120px" title="Parachute Loan" width="100%">
                            <webuijsf:tableRowGroup binding="#{para_loan$Edit.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                selected="#{para_loan$Edit.selectedState}" sourceData="#{para_loan$Edit.para_loanDataProvider}" sourceVar="currentRow">
                                <webuijsf:tableColumn align="center" headerText="Loan No" id="tableColumn1" sort="para_loan.para_loan_no" valign="middle">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['para_loan.para_loan_no']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="NRIC" id="tableColumn2" sort="para_loan.NRIC" valign="middle">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['para_loan.NRIC']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Type Prefix" id="tableColumn3" sort="para_loan.type_prefix_no" valign="middle">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['para_loan.type_prefix_no']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Chute No" id="tableColumn4" sort="para_loan.chute_no" valign="middle">
                                    <webuijsf:staticText id="staticText4" text="#{currentRow.value['para_loan.chute_no']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Serial No" id="tableColumn5" sort="para_loan.serial_no" valign="middle">
                                    <webuijsf:staticText id="staticText5" text="#{currentRow.value['para_loan.serial_no']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Date Out" id="tableColumn6" sort="para_loan.date_out" valign="middle">
                                    <webuijsf:staticText id="staticText6" text="#{currentRow.value['para_loan.date_out']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Date In" id="tableColumn7" sort="para_loan.date_in" valign="middle">
                                    <webuijsf:staticText id="staticText7" text="#{currentRow.value['para_loan.date_in']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn id="tableColumn8"
                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" selectId="checkbox1">
                                    <webuijsf:checkbox id="checkbox1" selected="#{para_loan$Edit.selected}" selectedValue="#{para_loan$Edit.selectedValue}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:calendar binding="#{para_loan$Edit.calendar1}" dateFormatPattern="dd-MM-yyyy" id="calendar1" label="Return Date"
                            required="true" style="position: absolute; left: 24px; top: 72px"/>
                        <webuijsf:button actionExpression="#{para_loan$Edit.edit_action}" id="edit" style="position: absolute; left: 24px; top: 48px" text="Return"/>
                        <webuijsf:message for="calendar1" id="message1" showDetail="false" showSummary="true" style="position: absolute; left: 288px; top: 72px"/>
                        <webuijsf:messageGroup id="messageGroup1" showGlobalOnly="true" style="position: absolute; left: 432px; top: 48px"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
