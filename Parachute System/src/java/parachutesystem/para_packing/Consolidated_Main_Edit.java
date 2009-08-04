/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parachutesystem.para_packing;

import com.sun.data.provider.RowKey;
import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.sql.rowset.CachedRowSetXImpl;
import com.sun.webui.jsf.component.Calendar;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.RadioButtonGroup;
import com.sun.webui.jsf.component.TableRowGroup;
import com.sun.webui.jsf.event.TableSelectPhaseListener;
import com.sun.webui.jsf.model.SingleSelectOptionsList;
import javax.faces.FacesException;
import javax.faces.convert.LongConverter;
import parachutesystem.SessionBean1;
import parachutesystem.ApplicationBean1;
import parachutesystem.RequestBean1;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version Consolidated_Main_Edit.java
 * @version Created on 28/07/2009, 1:55:27 PM
 * @author user
 */
public class Consolidated_Main_Edit extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        log("<<Entering para_packing Consolidated_Main_Edit>>");
        para_inventoryDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{para_packing$Consolidated_Main_Edit.para_inventoryRowSet}"));
        para_inventoryRowSet.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
        para_inventoryRowSet.setCommand("SELECT * FROM para_inventory");
        para_inventoryRowSet.setTableName("para_inventory");
        para_packingDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{para_packing$Consolidated_Main_Edit.para_packingRowSet}"));
        para_packingRowSet.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
        para_packingRowSet.setCommand("SELECT * FROM para_packing");
        para_packingRowSet.setTableName("para_packing");
        para_typeDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{para_packing$Consolidated_Main_Edit.para_typeRowSet}"));
        para_typeRowSet.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
        para_typeRowSet.setCommand("SELECT * FROM para_type");
        para_typeRowSet.setTableName("para_type");
        para_riggersDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{para_packing$Consolidated_Main_Edit.para_riggersRowSet}"));
        para_riggersRowSet.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
        para_riggersRowSet.setCommand("SELECT * FROM para_riggers WHERE para_riggers.rigger = 1");
        para_riggersRowSet.setTableName("para_riggers");
        para_riggersDataProvider1.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{para_packing$Consolidated_Main_Edit.para_riggersRowSet1}"));
        para_riggersRowSet1.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
        para_riggersRowSet1.setCommand("SELECT * FROM para_riggers WHERE para_riggers.inspector = 1");
        para_riggersRowSet1.setTableName("para_riggers");
        para_riggersDataProvider2.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{para_packing$Consolidated_Main_Edit.para_riggersRowSet2}"));
        para_riggersRowSet2.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
        para_riggersRowSet2.setCommand("SELECT * FROM para_riggers WHERE para_riggers.checker = 1");
        para_riggersRowSet2.setTableName("para_riggers");
        inspectionDDDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("", "Please Select"), new com.sun.webui.jsf.model.Option("Initial Inspection", "Initial Inspection"),new com.sun.webui.jsf.model.Option("Rigger Inspection", "Rigger Inspection"),new com.sun.webui.jsf.model.Option("Rigger Inspection (Water Jump)", "Rigger Inspection (Water Jump)"), new com.sun.webui.jsf.model.Option("Rigger Inspection (After Overseas)", "Rigger Inspection (Oversea Jump)"), new com.sun.webui.jsf.model.Option("Rigger Inspection (Malfunction)", "Rigger Inspection (Malfunction)"),new com.sun.webui.jsf.model.Option("Rigger Inspection (Tree Landing)", "Rigger Inspection (Tree Landing)")});
        radioButtonGroup1DefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("repacking", "Repacking"), new com.sun.webui.jsf.model.Option("inspection", "Inspection")});
        followUpDDDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("repair", "Repair"), new com.sun.webui.jsf.model.Option("unpacked", "Packing")});
    }
    private CachedRowSetDataProvider para_inventoryDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getPara_inventoryDataProvider() {
        return para_inventoryDataProvider;
    }

    public void setPara_inventoryDataProvider(CachedRowSetDataProvider crsdp) {
        this.para_inventoryDataProvider = crsdp;
    }
    private CachedRowSetXImpl para_inventoryRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPara_inventoryRowSet() {
        return para_inventoryRowSet;
    }

    public void setPara_inventoryRowSet(CachedRowSetXImpl crsxi) {
        this.para_inventoryRowSet = crsxi;
    }
    private CachedRowSetDataProvider para_packingDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getPara_packingDataProvider() {
        return para_packingDataProvider;
    }

    public void setPara_packingDataProvider(CachedRowSetDataProvider crsdp) {
        this.para_packingDataProvider = crsdp;
    }
    private CachedRowSetXImpl para_packingRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPara_packingRowSet() {
        return para_packingRowSet;
    }

    public void setPara_packingRowSet(CachedRowSetXImpl crsxi) {
        this.para_packingRowSet = crsxi;
    }
    private CachedRowSetDataProvider para_typeDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getPara_typeDataProvider() {
        return para_typeDataProvider;
    }

    public void setPara_typeDataProvider(CachedRowSetDataProvider crsdp) {
        this.para_typeDataProvider = crsdp;
    }
    private CachedRowSetXImpl para_typeRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPara_typeRowSet() {
        return para_typeRowSet;
    }

    public void setPara_typeRowSet(CachedRowSetXImpl crsxi) {
        this.para_typeRowSet = crsxi;
    }
    private LongConverter dropDown1Converter = new LongConverter();

    public LongConverter getDropDown1Converter() {
        return dropDown1Converter;
    }

    public void setDropDown1Converter(LongConverter lc) {
        this.dropDown1Converter = lc;
    }
    private CachedRowSetDataProvider para_riggersDataProvider1 = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getPara_riggersDataProvider1() {
        return para_riggersDataProvider1;
    }

    public void setPara_riggersDataProvider1(CachedRowSetDataProvider crsdp) {
        this.para_riggersDataProvider1 = crsdp;
    }
    private CachedRowSetXImpl para_riggersRowSet1 = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPara_riggersRowSet1() {
        return para_riggersRowSet1;
    }

    public void setPara_riggersRowSet1(CachedRowSetXImpl crsxi) {
        this.para_riggersRowSet1 = crsxi;
    }
    private CachedRowSetDataProvider cachedRowSetDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getCachedRowSetDataProvider() {
        return cachedRowSetDataProvider;
    }

    public void setCachedRowSetDataProvider(CachedRowSetDataProvider crsdp) {
        this.cachedRowSetDataProvider = crsdp;
    }
    private CachedRowSetDataProvider para_riggersDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getPara_riggersDataProvider() {
        return para_riggersDataProvider;
    }

    public void setPara_riggersDataProvider(CachedRowSetDataProvider crsdp) {
        this.para_riggersDataProvider = crsdp;
    }
    private CachedRowSetXImpl para_riggersRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPara_riggersRowSet() {
        return para_riggersRowSet;
    }

    public void setPara_riggersRowSet(CachedRowSetXImpl crsxi) {
        this.para_riggersRowSet = crsxi;
    }
    private TableRowGroup tableRowGroup1 = new TableRowGroup();

    public TableRowGroup getTableRowGroup1() {
        return tableRowGroup1;
    }

    public void setTableRowGroup1(TableRowGroup trg) {
        this.tableRowGroup1 = trg;
    }
    private TableSelectPhaseListener tablePhaseListener = new TableSelectPhaseListener();

    public void setSelected(Object object) {
        RowKey rowKey = (RowKey) getValue("#{currentRow.tableRow}");
        if (rowKey != null) {
            tablePhaseListener.setSelected(rowKey, object);
        }
    }

    public Object getSelected() {
        RowKey rowKey = (RowKey) getValue("#{currentRow.tableRow}");
        return tablePhaseListener.getSelected(rowKey);

    }

    public Object getSelectedValue() {
        RowKey rowKey = (RowKey) getValue("#{currentRow.tableRow}");
        return (rowKey != null) ? rowKey.getRowId() : null;

    }

    public boolean getSelectedState() {
        RowKey rowKey = (RowKey) getValue("#{currentRow.tableRow}");
        return tablePhaseListener.isSelected(rowKey);
    }
    private Calendar dateCal = new Calendar();

    public Calendar getDateCal() {
        return dateCal;
    }

    public void setDateCal(Calendar c) {
        this.dateCal = c;
    }
    private DropDown packerDD = new DropDown();

    public DropDown getPackerDD() {
        return packerDD;
    }

    public void setPackerDD(DropDown dd) {
        this.packerDD = dd;
    }
    private DropDown inspectorDD = new DropDown();

    public DropDown getInspectorDD() {
        return inspectorDD;
    }

    public void setInspectorDD(DropDown dd) {
        this.inspectorDD = dd;
    }
    private SingleSelectOptionsList inspectionDDDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getInspectionDDDefaultOptions() {
        return inspectionDDDefaultOptions;
    }

    public void setInspectionDDDefaultOptions(SingleSelectOptionsList ssol) {
        this.inspectionDDDefaultOptions = ssol;
    }
    private SingleSelectOptionsList radioButtonGroup1DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getRadioButtonGroup1DefaultOptions() {
        return radioButtonGroup1DefaultOptions;
    }

    public void setRadioButtonGroup1DefaultOptions(SingleSelectOptionsList ssol) {
        this.radioButtonGroup1DefaultOptions = ssol;
    }
    private RadioButtonGroup radioButtonGroup1 = new RadioButtonGroup();

    public RadioButtonGroup getRadioButtonGroup1() {
        return radioButtonGroup1;
    }

    public void setRadioButtonGroup1(RadioButtonGroup rbg) {
        this.radioButtonGroup1 = rbg;
    }
    private DropDown inspectionDD = new DropDown();

    public DropDown getInspectionDD() {
        return inspectionDD;
    }

    public void setInspectionDD(DropDown dd) {
        this.inspectionDD = dd;
    }
    private DropDown checkerDD = new DropDown();

    public DropDown getCheckerDD() {
        return checkerDD;
    }

    public void setCheckerDD(DropDown dd) {
        this.checkerDD = dd;
    }
    private SingleSelectOptionsList followUpDDDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getFollowUpDDDefaultOptions() {
        return followUpDDDefaultOptions;
    }

    public void setFollowUpDDDefaultOptions(SingleSelectOptionsList ssol) {
        this.followUpDDDefaultOptions = ssol;
    }
    private DropDown followUpDD = new DropDown();

    public DropDown getFollowUpDD() {
        return followUpDD;
    }

    public void setFollowUpDD(DropDown dd) {
        this.followUpDD = dd;
    }
    private DropDown inspectorDD1 = new DropDown();

    public DropDown getInspectorDD1() {
        return inspectorDD1;
    }

    public void setInspectorDD1(DropDown dd) {
        this.inspectorDD1 = dd;
    }
    private CachedRowSetDataProvider para_riggersDataProvider2 = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getPara_riggersDataProvider2() {
        return para_riggersDataProvider2;
    }

    public void setPara_riggersDataProvider2(CachedRowSetDataProvider crsdp) {
        this.para_riggersDataProvider2 = crsdp;
    }
    private CachedRowSetXImpl para_riggersRowSet2 = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPara_riggersRowSet2() {
        return para_riggersRowSet2;
    }

    public void setPara_riggersRowSet2(CachedRowSetXImpl crsxi) {
        this.para_riggersRowSet2 = crsxi;
    }

    // </editor-fold>
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public Consolidated_Main_Edit() {
    }

    /**
     * <p>Callback method that is called whenever a page is navigated to,
     * either directly via a URL, or indirectly via page navigation.
     * Customize this method to acquire resources that will be needed
     * for event handlers and lifecycle methods, whether or not this
     * page is performing post back processing.</p>
     * 
     * <p>Note that, if the current request is a postback, the property
     * values of the components do <strong>not</strong> represent any
     * values submitted with this request.  Instead, they represent the
     * property values that were saved for this view when it was rendered.</p>
     */
    @Override
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here

        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("Consolidated_Main_Edit Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }

    // </editor-fold>
    // Perform application initialization that must complete
    // *after* managed components are initialized
    // TODO - add your own initialization code here
    }

    /**
     * <p>Callback method that is called after the component tree has been
     * restored, but before any event processing takes place.  This method
     * will <strong>only</strong> be called on a postback request that
     * is processing a form submit.  Customize this method to allocate
     * resources that will be required in your event handlers.</p>
     */
    @Override
    public void preprocess() {
    }

    /**
     * <p>Callback method that is called just before rendering takes place.
     * This method will <strong>only</strong> be called for the page that
     * will actually be rendered (and not, for example, on a page that
     * handled a postback and then navigated to a different page).  Customize
     * this method to allocate resources that will be required for rendering
     * this page.</p>
     */
    @Override
    public void prerender() {
    }

    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called (regardless of whether
     * or not this was the page that was actually rendered).  Customize this
     * method to release resources acquired in the <code>init()</code>,
     * <code>preprocess()</code>, or <code>prerender()</code> methods (or
     * acquired during execution of an event handler).</p>
     */
    @Override
    public void destroy() {
        para_inventoryDataProvider.close();
        para_packingDataProvider.close();
        para_typeDataProvider.close();
        para_riggersDataProvider.close();
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1) getBean("RequestBean1");
    }

    public String save_action() {
        int selectedRows = getTableRowGroup1().getSelectedRowsCount();
        if (selectedRows > 0) {
            RowKey[] selectedRowKeys = getTableRowGroup1().getSelectedRowKeys();
            for (int i = 0; i < selectedRowKeys.length; i++) {
                int rowId = Integer.parseInt(selectedRowKeys[i].getRowId()) + 1;
                info("Row " + rowId + " is selected");
                log("Row " + rowId + " is selected");

                if (para_packingDataProvider.canAppendRow()) {
                    para_inventoryDataProvider.setCursorRow(selectedRowKeys[i]);

                    //String[] fieldKeys = {"para_inventory.type_prefix_no", "para_inventory.chute_no", "para_inventory.serial_no"};
                    //Object[] values = {para_packing_viewDataProvider.getValue("para_type_no"), para_packing_viewDataProvider.getValue("chute_no"), para_packing_viewDataProvider.getValue("Serial No")};
                    //RowKey[] rks = para_inventoryDataProvider.findAll(fieldKeys, values);

                    RowKey appendedRow = para_packingDataProvider.appendRow();
                    if (appendedRow != null && radioButtonGroup1.getValue().equals("repacking")) {
                        para_packingDataProvider.setCursorRow(appendedRow);
                        para_packingDataProvider.setValue("para_packing.type_prefix_no", para_inventoryDataProvider.getValue("type_prefix_no"));
                        para_packingDataProvider.setValue("para_packing.chute_no", para_inventoryDataProvider.getValue("chute_no"));
                        para_packingDataProvider.setValue("para_packing.serial_no", para_inventoryDataProvider.getValue("serial_no"));
                        para_packingDataProvider.setValue("inner_no", "");
                        para_packingDataProvider.setValue("para_packing.date_packed", dateCal.getValue());
                        para_packingDataProvider.setValue("para_packing.pack_by", packerDD.getSelected());
                        para_packingDataProvider.setValue("para_packing.inspect_by", checkerDD.getSelected());
                        para_packingDataProvider.setValue("para_packing.check_type", "repacking");
                        para_packingDataProvider.setValue("para_packing.inspection", inspectionDD.getSelected());
                        para_packingDataProvider.setValue("para_packing.repacking", true);

                        para_inventoryDataProvider.setValue("para_inventory.date_packed", dateCal.getValue());
                        para_inventoryDataProvider.setValue("para_inventory.status", "packed");

                        para_packingDataProvider.commitChanges();
                        para_packingDataProvider.refresh();

                        para_inventoryDataProvider.commitChanges();
                        para_inventoryDataProvider.refresh();
                    } else if (appendedRow != null && radioButtonGroup1.getValue().equals("inspection")){
                        if (inspectionDD.getSelected().equals("")) {
                            log(" INFO - Please select a type of inspection");
                            info(" INFO - Please select a type of inspection");
                            return null;
                        }
                        para_packingDataProvider.setCursorRow(appendedRow);
                        para_packingDataProvider.setValue("para_packing.type_prefix_no", para_inventoryDataProvider.getValue("type_prefix_no"));
                        para_packingDataProvider.setValue("para_packing.chute_no", para_inventoryDataProvider.getValue("chute_no"));
                        para_packingDataProvider.setValue("para_packing.serial_no", para_inventoryDataProvider.getValue("serial_no"));
                        para_packingDataProvider.setValue("inner_no", "");
                        para_packingDataProvider.setValue("para_packing.date_packed", dateCal.getValue());
                        para_packingDataProvider.setValue("para_packing.pack_by", "-");
                        para_packingDataProvider.setValue("para_packing.inspect_by", inspectorDD.getSelected() +" / " +inspectorDD1.getSelected());
                        para_packingDataProvider.setValue("para_packing.check_type", "inspection");
                        para_packingDataProvider.setValue("para_packing.inspection", inspectionDD.getSelected());
                        para_packingDataProvider.setValue("para_packing.repacking", false);

                        para_inventoryDataProvider.setValue("para_inventory.status", followUpDD.getValue());

                        para_packingDataProvider.commitChanges();
                        para_packingDataProvider.refresh();

                        para_inventoryDataProvider.commitChanges();
                        para_inventoryDataProvider.refresh();
                    }
                    else {
                        log(" ERROR - para_packing.Add : Append Row Error");
                        error(" ERROR - Append Row Error");
                        return null;
                    }
                } else {
                    log(" ERROR - para_packing.Add : Cannot append row");
                    error(" ERROR - Cannot append row");
                    return null;
                }
            }
            log(" INFO - para_packing.Add : Loop ended without incidents");
            info(" INFO - Loop ended without incidents");
            return "editToView";
        } else {
            log(" INFO - para_loan.Add : No row selected");
            info(" INFO - Please select a row.");
            return null;
        }
    }
}

