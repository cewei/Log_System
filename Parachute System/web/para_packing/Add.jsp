<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Add
    Created on : Jun 3, 2009, 3:50:26 PM
    Author     : Dell
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="Add Packing">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:label id="label1" style="position: absolute; left: 24px; top: 72px" text="Serial No"/>
                        <webuijsf:label id="label2" style="position: absolute; left: 24px; top: 96px" text="Chute No"/>
                        <webuijsf:label for="repackDateCal" id="label3" style="position: absolute; left: 24px; top: 120px" text="Repacked Date"/>
                        <webuijsf:label for="packByDD" id="label4" style="position: absolute; left: 24px; top: 144px" text="Packed by"/>
                        <webuijsf:label for="inspectByDD" id="label5" style="position: absolute; left: 24px; top: 168px" text="Inspected by"/>
                        <webuijsf:label for="checkTypeDD" id="label6" style="position: absolute; left: 24px; top: 192px" text="Check Type"/>
                        <webuijsf:label for="statusDD" id="label7" style="position: absolute; left: 24px; top: 216px" text="Status"/>
                        <webuijsf:staticText id="serialNoST" style="position: absolute; left: 120px; top: 72px" text="#{para_packing$ParaPackingBean.serialNo}"/>
                        <webuijsf:staticText id="chuteNoST" style="position: absolute; left: 120px; top: 96px" text="#{para_packing$ParaPackingBean.chute_No} ** #{para_packing$ParaPackingBean.paraTypeNo}-#{para_packing$ParaPackingBean.chuteNo}"/>
                        <webuijsf:calendar binding="#{para_packing$Add.repackDateCal}" dateFormatPattern="dd-MM-yyyy" id="repackDateCal" required="true"
                            selectedDate="#{para_packing$ParaPackingBean.datePacked}" style="position: absolute; left: 120px; top: 120px"/>
                        <webuijsf:dropDown binding="#{para_packing$Add.packByDD}" id="packByDD"
                            items="#{para_packing$Add.para_riggersDataProvider.options['para_riggers.NRIC,para_riggers.name']}"
                            selected="#{para_packing$ParaPackingBean.packBy}" style="position: absolute; left: 120px; top: 144px"/>
                        <webuijsf:dropDown binding="#{para_packing$Add.inspectByDD}" id="inspectByDD"
                            items="#{para_packing$Add.para_riggersDataProvider1.options['para_riggers.NRIC,para_riggers.name']}"
                            selected="#{para_packing$ParaPackingBean.inspectBy}" style="position: absolute; left: 120px; top: 168px"/>
                        <webuijsf:dropDown binding="#{para_packing$Add.checkTypeDD}" id="checkTypeDD"
                            items="#{para_packing$Add.checkTypeDDDefaultOptions.options}" selected="#{para_packing$ParaPackingBean.checkType}" style="position: absolute; left: 120px; top: 192px"/>
                        <webuijsf:dropDown binding="#{para_packing$Add.statusDD}" id="statusDD" items="#{para_packing$Add.statusDDDefaultOptions.options}"
                            selected="#{para_packing$ParaPackingBean.status}" style="position: absolute; left: 120px; top: 216px"/>
                        <webuijsf:button actionExpression="#{para_packing$Add.update_action}" id="update" style="position: absolute; left: 24px; top: 264px" text="Update"/>
                        <webuijsf:message for="repackDateCal" id="message1" showDetail="false" showSummary="true" style="left: 288px; top: 120px; position: absolute"/>
                        <webuijsf:breadcrumbs id="breadcrumbs1" style="left: 14px; top: 14px; position: absolute">
                            <webuijsf:hyperlink id="hyperlink1" text="Page1" url="/"/>
                            <webuijsf:hyperlink id="hyperlink2" text="para_packing/View" url="/faces/para_packing/View.jsp"/>
                            <webuijsf:hyperlink id="hyperlink3" text="para_packing/Add" url="/faces/para_packing/Add.jsp"/>
                        </webuijsf:breadcrumbs>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
