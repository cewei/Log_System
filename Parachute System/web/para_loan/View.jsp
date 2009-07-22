<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : View
    Created on : Jun 9, 2009, 5:04:43 PM
    Author     : Dell
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="View Parachute Loan">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:button actionExpression="#{para_loan$View.add_action}" id="add" style="position: absolute; left: 24px; top: 48px" text="Add"/>
                        <webuijsf:button actionExpression="#{para_loan$View.edit_action}" id="edit" style="position: absolute; left: 96px; top: 48px" text="Edit"/>
                        <webuijsf:table augmentTitle="false" id="table1" style="position: absolute; left: 24px; top: 72px" title="Parachute Loans" width="100%">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{para_loan$View.para_loan_viewDataProvider}" sourceVar="currentRow">
                                <webuijsf:tableColumn align="center" headerText="NRIC" id="tableColumn6" sort="para_loan_view.NRIC" valign="middle">
                                    <webuijsf:staticText id="staticText6" text="#{currentRow.value['para_loan_view.NRIC']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Rank" id="tableColumn7" sort="para_loan_view.Rank" valign="middle">
                                    <webuijsf:staticText id="staticText7" text="#{currentRow.value['para_loan_view.Rank']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Borrower" id="tableColumn8" sort="para_loan_view.Borrower" valign="middle">
                                    <webuijsf:staticText id="staticText8" text="#{currentRow.value['para_loan_view.Borrower']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Unit" id="tableColumn9" sort="para_loan_view.Unit" valign="middle">
                                    <webuijsf:staticText id="staticText9" text="#{currentRow.value['para_loan_view.Unit']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Serial No" id="tableColumn1" sort="para_loan_view.Serial No" valign="middle">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['para_loan_view.Serial No']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Name" id="tableColumn2" sort="para_loan_view.Name" valign="middle">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['para_loan_view.Name']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Chute No" id="tableColumn3" sort="para_loan_view.Chute No" valign="middle">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['para_loan_view.Chute No']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Date Out" id="tableColumn4" sort="para_loan_view.Date Out" valign="middle">
                                    <webuijsf:staticText id="staticText4" text="#{currentRow.value['para_loan_view.Date Out']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Date In" id="tableColumn5" sort="para_loan_view.Date In" valign="middle">
                                    <webuijsf:staticText id="staticText5" text="#{currentRow.value['para_loan_view.Date In']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:breadcrumbs id="breadcrumbs1" style="left: 14px; top: 14px; position: absolute">
                            <webuijsf:hyperlink id="hyperlink1" text="Page1" url="/"/>
                            <webuijsf:hyperlink id="hyperlink2" text="para_loan/View" url="/faces/para_loan/View.jsp"/>
                        </webuijsf:breadcrumbs>
                        <webuijsf:button actionExpression="#{para_loan$View.bulk_action}" id="bulk" style="position: absolute; left: 168px; top: 48px" text="Bulk"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
