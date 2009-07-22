/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parachutesystem.para_loan;

import com.sun.data.provider.RowKey;
import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.sql.rowset.CachedRowSetXImpl;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.Calendar;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.Upload;
import com.sun.webui.jsf.model.UploadedFile;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.faces.FacesException;
import javax.servlet.ServletContext;
import parachutesystem.ApplicationBean1;
import parachutesystem.Chutes;
import parachutesystem.RequestBean1;
import parachutesystem.SessionBean1;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version Bulk.java
 * @version Created on Jul 15, 2009, 11:21:41 AM
 * @author Dell
 */
public class Bulk extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        para_borrowersDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{para_loan$Bulk.para_borrowersRowSet}"));
        para_borrowersRowSet.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
        para_borrowersRowSet.setCommand("SELECT * FROM para_borrowers");
        para_borrowersRowSet.setTableName("para_borrowers");
        para_inventoryDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{para_loan$Bulk.para_inventoryRowSet}"));
        para_inventoryRowSet.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
        para_inventoryRowSet.setCommand("SELECT * FROM para_inventory");
        para_inventoryRowSet.setTableName("para_inventory");
        para_loanDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{para_loan$Bulk.para_loanRowSet}"));
        para_loanRowSet.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
        para_loanRowSet.setCommand("SELECT * FROM para_loan");
        para_loanRowSet.setTableName("para_loan");
        para_typeDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{para_loan$Bulk.para_typeRowSet}"));
        para_typeRowSet.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
        para_typeRowSet.setCommand("SELECT * FROM para_type");
        para_typeRowSet.setTableName("para_type");
    }
    private CachedRowSetDataProvider para_borrowersDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getPara_borrowersDataProvider() {
        return para_borrowersDataProvider;
    }

    public void setPara_borrowersDataProvider(CachedRowSetDataProvider crsdp) {
        this.para_borrowersDataProvider = crsdp;
    }
    private CachedRowSetXImpl para_borrowersRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPara_borrowersRowSet() {
        return para_borrowersRowSet;
    }

    public void setPara_borrowersRowSet(CachedRowSetXImpl crsxi) {
        this.para_borrowersRowSet = crsxi;
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
    private CachedRowSetDataProvider para_loanDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getPara_loanDataProvider() {
        return para_loanDataProvider;
    }

    public void setPara_loanDataProvider(CachedRowSetDataProvider crsdp) {
        this.para_loanDataProvider = crsdp;
    }
    private CachedRowSetXImpl para_loanRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPara_loanRowSet() {
        return para_loanRowSet;
    }

    public void setPara_loanRowSet(CachedRowSetXImpl crsxi) {
        this.para_loanRowSet = crsxi;
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
    private Upload fileUpload1 = new Upload();

    public Upload getFileUpload1() {
        return fileUpload1;
    }

    public void setFileUpload1(Upload u) {
        this.fileUpload1 = u;
    }
    private Button upload = new Button();

    public Button getUpload() {
        return upload;
    }

    public void setUpload(Button b) {
        this.upload = b;
    }
    private String realFilePath;
    private static final String FILE_URL = "/resources/upload";
    private Upload fileUpload2 = new Upload();

    public Upload getFileUpload2() {
        return fileUpload2;
    }

    public void setFileUpload2(Upload u) {
        this.fileUpload2 = u;
    }
    private Chutes[] listOfChutes;

    public Chutes[] getListOfChutes() {
        return listOfChutes;
    }

    public void setListOfChutes(Chutes[] listOfChutes) {
        this.listOfChutes = listOfChutes;
    }
    private DropDown nricDD = new DropDown();

    public DropDown getNricDD() {
        return nricDD;
    }

    public void setNricDD(DropDown dd) {
        this.nricDD = dd;
    }
    private Calendar calendar1 = new Calendar();

    public Calendar getCalendar1() {
        return calendar1;
    }

    public void setCalendar1(Calendar c) {
        this.calendar1 = c;
    }

    // </editor-fold>
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public Bulk() {
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
            log("Bulk Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }

        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
        ServletContext theApplicationsServletContext = (ServletContext) this.getExternalContext().getContext();
        this.realFilePath = theApplicationsServletContext.getRealPath(FILE_URL);
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
        para_typeDataProvider.close();
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

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    public String upload_action() {
        UploadedFile uploadedFileMain = fileUpload1.getUploadedFile();
        UploadedFile uploadedFileReserve = fileUpload2.getUploadedFile();

        if (uploadedFileMain == null) {
            log("Main file null");
            return null;
        }
        if (uploadedFileReserve == null) {
            log("Reserve file null");
        }

        String uploadedFileMainName = uploadedFileMain.getOriginalName();
        String uploadedFileReserveName = uploadedFileReserve.getOriginalName();
        // Some browsers return complete path name, some don't
        // Make sure we only have the file name
        // First, try forward slash
        int indexMain = uploadedFileMainName.lastIndexOf('/');
        int indexReserve = uploadedFileReserveName.lastIndexOf('/');
        String justFileMainName;
        String justFileReserveName;
        if (indexMain >= 0) {
            justFileMainName = uploadedFileMainName.substring(indexMain + 1);
        } else {
            // Try backslash
            indexMain = uploadedFileMainName.lastIndexOf('\\');
            if (indexMain >= 0) {
                justFileMainName = uploadedFileMainName.substring(indexMain + 1);
            } else {
                // No forward or back slashes
                justFileMainName = uploadedFileMainName;
            }

        }
        if (indexReserve >= 0) {
            justFileReserveName = uploadedFileReserveName.substring(indexReserve + 1);
        } else {
            // Try backslash
            indexReserve = uploadedFileReserveName.lastIndexOf('\\');
            if (indexReserve >= 0) {
                justFileReserveName = uploadedFileReserveName.substring(indexReserve + 1);
            } else {
                // No forward or back slashes
                justFileReserveName = uploadedFileReserveName;
            }

        }
        try {
            File fileMain = new File(this.realFilePath + justFileMainName);
            File fileReserve = new File(this.realFilePath + justFileReserveName);
            uploadedFileMain.write(fileMain);
            uploadedFileReserve.write(fileReserve);
            log("uploaded");

            ArrayList<Chutes> mainChuteTemp = new ArrayList<Chutes>();
            FileReader frMain = new FileReader(fileMain);
            FileReader frReserve = new FileReader(fileReserve);
            BufferedReader brMain = new BufferedReader(frMain);
            BufferedReader brReserve = new BufferedReader(frReserve);
            while (brMain.ready() || brReserve.ready()) {
                StringTokenizer stMain = new StringTokenizer(brMain.readLine(), "%");
                StringTokenizer stReserve = new StringTokenizer(brReserve.readLine(), "%");

                while (stMain.hasMoreTokens() && stReserve.hasMoreTokens()) {
                    String main = stMain.nextToken();
                    String mainSerial = stMain.nextToken();
                    String reserve = stReserve.nextToken();
                    String reserveSerial = stReserve.nextToken();

                    mainChuteTemp.add(new Chutes(main, reserve));
                    stMain.nextToken();
                    stReserve.nextToken();
                    //for main
                    if (para_loanDataProvider.canAppendRow()) {
                        StringTokenizer stTemp = new StringTokenizer(main, "-");
                        Object type_prefix = null;
                        String chute_no = null;
                        if (stTemp.countTokens() == 2) {
                            type_prefix = stTemp.nextToken();
                            chute_no = stTemp.nextToken();
                        } else {
                            log(" ERROR - para_loan.Add : Cannot resolve Type Prefix");
                            return null;
                        }
                        RowKey row = para_typeDataProvider.findFirst("type_prefix", type_prefix);
                        Object type_no = para_typeDataProvider.getValue("para_type_no", row);

                        String[] fieldKeys = {"type_prefix_no", "chute_no", "serial_no"};
                        Object[] value = {type_no, chute_no, mainSerial};

                        RowKey[] rows = para_inventoryDataProvider.findAll(fieldKeys, value);
                        if (rows.length == 1) {
                            para_inventoryDataProvider.setCursorRow(rows[0]);
                        } else {
                            log(" ERROR - para_loan.Add : Too many inventory");
                            return null;
                        }

                        RowKey appendRow = para_loanDataProvider.appendRow();
                        para_loanDataProvider.setCursorRow(appendRow);
                        para_loanDataProvider.setValue("nric", nricDD.getValue());
                        para_loanDataProvider.setValue("type_prefix_no", para_inventoryDataProvider.getValue("type_prefix_no"));
                        para_loanDataProvider.setValue("chute_no", para_inventoryDataProvider.getValue("chute_no"));
                        para_loanDataProvider.setValue("serial_no", para_inventoryDataProvider.getValue("serial_no"));
                        para_loanDataProvider.setValue("date_out", calendar1.getValue());
                        para_loanDataProvider.commitChanges();

                        para_inventoryDataProvider.setValue("status", "loan");
                        para_inventoryDataProvider.commitChanges();
                    } else {
                        log(" ERROR - para_loan.Add : Cannot append row");
                        error(" ERROR - Cannot append row");
                        return null;
                    }
                    // for reserve
                    if (para_loanDataProvider.canAppendRow()) {
                        StringTokenizer stTemp = new StringTokenizer(reserve, "-");
                        Object type_prefix = null;
                        String chute_no = null;
                        if (stTemp.countTokens() == 2) {
                            type_prefix = stTemp.nextToken();
                            chute_no = stTemp.nextToken();
                        } else {
                            log(" ERROR - para_loan.Add : Cannot resolve Type Prefix");
                            return null;
                        }
                        RowKey row = para_typeDataProvider.findFirst("type_prefix", type_prefix);
                        Object type_no = para_typeDataProvider.getValue("para_type_no", row);

                        String[] fieldKeys = {"type_prefix_no", "chute_no", "serial_no"};
                        Object[] value = {type_no, chute_no, reserveSerial};

                        RowKey[] rows = para_inventoryDataProvider.findAll(fieldKeys, value);
                        if (rows.length == 1) {
                            para_inventoryDataProvider.setCursorRow(rows[0]);
                        } else {
                            log(" ERROR - para_loan.Add : Too many inventory");
                            return null;
                        }

                        RowKey appendRow = para_loanDataProvider.appendRow();
                        para_loanDataProvider.setCursorRow(appendRow);
                        para_loanDataProvider.setValue("nric", nricDD.getValue());
                        para_loanDataProvider.setValue("type_prefix_no", para_inventoryDataProvider.getValue("type_prefix_no"));
                        para_loanDataProvider.setValue("chute_no", para_inventoryDataProvider.getValue("chute_no"));
                        para_loanDataProvider.setValue("serial_no", para_inventoryDataProvider.getValue("serial_no"));
                        para_loanDataProvider.setValue("date_out", calendar1.getValue());
                        para_loanDataProvider.commitChanges();

                        para_inventoryDataProvider.setValue("status", "loan");
                        para_inventoryDataProvider.commitChanges();
                    } else {
                        log(" ERROR - para_loan.Add : Cannot append row");
                        error(" ERROR - Cannot append row");
                        return null;
                    }
                }
            }
            brMain.close();
            brReserve.close();
            frMain.close();
            frReserve.close();
            listOfChutes = new Chutes[mainChuteTemp.size()];
            mainChuteTemp.toArray(listOfChutes);
            getSessionBean1().setMainChute(listOfChutes);
            return "bulkToReport";
        } catch (Exception ex) {
            error("Cannot upload file: " + justFileMainName);
            error("Cannot upload file: " + justFileReserveName);
            error(ex.toString());
        }
        return null;
    }
}

