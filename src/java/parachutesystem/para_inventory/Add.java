/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parachutesystem.para_inventory;

import com.sun.data.provider.RowKey;
import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.sql.rowset.CachedRowSetXImpl;
import com.sun.webui.jsf.component.Calendar;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.Form;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.model.SingleSelectOptionsList;
import javax.faces.FacesException;
import javax.faces.convert.LongConverter;
import javax.faces.event.ValueChangeEvent;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version Add.java
 * @version Created on Jun 1, 2009, 9:19:02 AM
 * @author Dell
 */
public class Add extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        para_inventory_viewDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{para_inventory$Add.para_inventory_viewRowSet}"));
        para_inventory_viewRowSet.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
        para_inventory_viewRowSet.setCommand("SELECT * FROM para_inventory_view WHERE para_inventory_view.`Type Prefix No` = ?");
        para_inventory_viewRowSet.setTableName("para_inventory_view");
        para_typeDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{para_inventory$Add.para_typeRowSet}"));
        para_typeRowSet.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
        para_typeRowSet.setCommand("SELECT * FROM para_type");
        para_typeRowSet.setTableName("para_type");
        para_inventoryDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{para_inventory$Add.para_inventoryRowSet}"));
        para_inventoryRowSet.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
        para_inventoryRowSet.setCommand("SELECT * FROM para_inventory");
        para_inventoryRowSet.setTableName("para_inventory");
        statusDDDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{
            new com.sun.webui.jsf.model.Option("unpacked", "unpacked"),
            new com.sun.webui.jsf.model.Option("packed", "packed"),
            new com.sun.webui.jsf.model.Option("inspection", "inspection"),
            new com.sun.webui.jsf.model.Option("repair", "repair"),
            new com.sun.webui.jsf.model.Option("unserviceable", "unserviceable"),
            new com.sun.webui.jsf.model.Option("others", "others"),
            new com.sun.webui.jsf.model.Option("loan", "loan"),
            new com.sun.webui.jsf.model.Option("returned", "returned")
        });
    }
    private CachedRowSetXImpl para_typeRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPara_typeRowSet() {
        return para_typeRowSet;
    }

    public void setPara_typeRowSet(CachedRowSetXImpl crsxi) {
        this.para_typeRowSet = crsxi;
    }
    private CachedRowSetXImpl para_inventory_viewRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPara_inventory_viewRowSet() {
        return para_inventory_viewRowSet;
    }

    public void setPara_inventory_viewRowSet(CachedRowSetXImpl crsxi) {
        this.para_inventory_viewRowSet = crsxi;
    }
    private SingleSelectOptionsList statusDDDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getStatusDDDefaultOptions() {
        return statusDDDefaultOptions;
    }

    public void setStatusDDDefaultOptions(SingleSelectOptionsList ssol) {
        this.statusDDDefaultOptions = ssol;
    }
    private CachedRowSetDataProvider para_inventory_viewDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getPara_inventory_viewDataProvider() {
        return para_inventory_viewDataProvider;
    }

    public void setPara_inventory_viewDataProvider(CachedRowSetDataProvider crsdp) {
        this.para_inventory_viewDataProvider = crsdp;
    }
    private CachedRowSetDataProvider para_typeDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getPara_typeDataProvider() {
        return para_typeDataProvider;
    }

    public void setPara_typeDataProvider(CachedRowSetDataProvider crsdp) {
        this.para_typeDataProvider = crsdp;
    }
    private LongConverter typeDDConverter = new LongConverter();

    public LongConverter getTypeDDConverter() {
        return typeDDConverter;
    }

    public void setTypeDDConverter(LongConverter lc) {
        this.typeDDConverter = lc;
    }
    private DropDown typeDD = new DropDown();

    public DropDown getTypeDD() {
        return typeDD;
    }

    public void setTypeDD(DropDown dd) {
        this.typeDD = dd;
    }
    private Form form1 = new Form();

    public Form getForm1() {
        return form1;
    }

    public void setForm1(Form f) {
        this.form1 = f;
    }
    private TextField chuteNoTF = new TextField();

    public TextField getChuteNoTF() {
        return chuteNoTF;
    }

    public void setChuteNoTF(TextField tf) {
        this.chuteNoTF = tf;
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
    private TextField serialNoTF = new TextField();

    public TextField getSerialNoTF() {
        return serialNoTF;
    }

    public void setSerialNoTF(TextField tf) {
        this.serialNoTF = tf;
    }
    private Calendar dateOfMfgCal = new Calendar();

    public Calendar getDateOfMfgCal() {
        return dateOfMfgCal;
    }

    public void setDateOfMfgCal(Calendar c) {
        this.dateOfMfgCal = c;
    }
    private TextField noOfJumpsTF = new TextField();

    public TextField getNoOfJumpsTF() {
        return noOfJumpsTF;
    }

    public void setNoOfJumpsTF(TextField tf) {
        this.noOfJumpsTF = tf;
    }
    private DropDown statusDD = new DropDown();

    public DropDown getStatusDD() {
        return statusDD;
    }

    public void setStatusDD(DropDown dd) {
        this.statusDD = dd;
    }

    // </editor-fold>
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public Add() {
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
            log("Add Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }

    // </editor-fold>
    // Perform application initialization that must complete
    // *after* managed components are initialized
    // TODO - add your own initialization code here
        if (typeDD.getSelected() == null) {
            Object firstSelected = null;
            try {
                para_typeDataProvider.cursorFirst();
                firstSelected = para_typeDataProvider.getValue("para_type_no");
                typeDD.setSelected(firstSelected);
                getPara_inventory_viewRowSet().setObject(1, firstSelected);
                para_inventory_viewDataProvider.refresh();
            } catch (Exception ex) {
                log(" ERROR - para_inventory.Add : Error Description", ex);
                error(" ERROR - " +ex.getMessage());
            }
        } else {
            Object typeID = typeDD.getSelected();
            try {
                para_typeDataProvider.setCursorRow(
                        para_typeDataProvider.findFirst("para_type_no", typeID));
                getPara_inventory_viewRowSet().setObject(1, typeID);
                para_inventory_viewDataProvider.refresh();
            } catch (Exception ex) {
                log(" ERROR - para_inventory.Add : Error Description", ex);
                error(" ERROR - " +ex.getMessage());
            }
        }
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
        if (typeDD.getSelected() == null) {
            Object firstSelected = null;
            try {
                para_typeDataProvider.cursorFirst();
                firstSelected = para_typeDataProvider.getValue("para_type_no");
                typeDD.setSelected(firstSelected);
                getPara_inventory_viewRowSet().setObject(1, firstSelected);
                para_inventory_viewDataProvider.refresh();
            } catch (Exception ex) {
                log(" ERROR - para_inventory.Add : Error Description", ex);
                error(" ERROR - " +ex.getMessage());
            }
        } else {
            Object typeID = typeDD.getSelected();
            try {
                para_typeDataProvider.setCursorRow(
                        para_typeDataProvider.findFirst("para_type_no", typeID));
                getPara_inventory_viewRowSet().setObject(1, typeID);
                para_inventory_viewDataProvider.refresh();
            } catch (Exception ex) {
                log(" ERROR - para_inventory.Add : Error Description", ex);
                error(" ERROR - " +ex.getMessage());
            }
        }
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
        para_inventory_viewDataProvider.close();
        para_typeDataProvider.close();
        para_inventoryDataProvider.close();
    }

    public String add_action() {
        try {
            if (para_inventoryDataProvider.canAppendRow()) {
                RowKey appendedRow = para_inventoryDataProvider.appendRow();
                if (appendedRow != null) {
                    para_inventoryDataProvider.setCursorRow(appendedRow);
                    para_inventoryDataProvider.setValue("PARA_INVENTORY.TYPE_PREFIX_NO", appendedRow, typeDD.getSelected());
                    para_inventoryDataProvider.setValue("PARA_INVENTORY.CHUTE_NO", chuteNoTF.getText());
                    para_inventoryDataProvider.setValue("PARA_INVENTORY.SERIAL_NO", serialNoTF.getText());
                    para_inventoryDataProvider.setValue("PARA_INVENTORY.DATE_OF_MFG", dateOfMfgCal.getText());
                    para_inventoryDataProvider.setValue("PARA_INVENTORY.NO_OF_JUMPS", noOfJumpsTF.getText());
                    para_inventoryDataProvider.setValue("PARA_INVENTORY.STATUS", statusDD.getSelected());
                    // set values of other fields, if any
                    para_inventoryDataProvider.commitChanges();
                    para_inventoryDataProvider.refresh();
                    para_inventory_viewDataProvider.refresh();
                }
                return "addToView";
            } else {
                log(" ERROR - para_inventory.Add : Cannot append row");
                error(" ERROR - Cannot append row");
                return null;
            }
        } catch (Exception ex) {
            log(" ERROR - para_type.Add : Error Description ", ex);
            error(" ERROR - " + ex.getMessage());
            return null;
        }
    }

    public void typeDD_processValueChange(ValueChangeEvent event) {
        if (typeDD.getSelected() == null) {
            Object firstSelected = null;
            try {
                para_typeDataProvider.cursorFirst();
                firstSelected = para_typeDataProvider.getValue("para_type_no");
                typeDD.setSelected(firstSelected);
                getPara_inventory_viewRowSet().setObject(1, firstSelected);
                para_inventory_viewDataProvider.refresh();
            } catch (Exception ex) {
                log(" ERROR - para_inventory.Add : Error Description", ex);
                error(" ERROR - " +ex.getMessage());
            }
        } else {
            Object typeID = typeDD.getSelected();
            try {
                para_typeDataProvider.setCursorRow(
                        para_typeDataProvider.findFirst("para_type_no", typeID));
                getPara_inventory_viewRowSet().setObject(1, typeID);
                para_inventory_viewDataProvider.refresh();
            } catch (Exception ex) {
                log(" ERROR - para_inventory.Add : Error Description", ex);
                error(" ERROR - " +ex.getMessage());
            }
        }
    }
}

