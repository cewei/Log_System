/*
 * IcePage1.java
 *
 * Created on Jul 6, 2009, 2:30:53 PM
 * Copyright Dell
 */
package parachutesystem;

import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.sql.rowset.CachedRowSetXImpl;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import javax.faces.FacesException;
import javax.servlet.ServletContext;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class IcePage1 extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    private int __placeholder;

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
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
    private CachedRowSetXImpl para_inventoryRowSet1 = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPara_inventoryRowSet1() {
        return para_inventoryRowSet1;
    }

    public void setPara_inventoryRowSet1(CachedRowSetXImpl crsxi) {
        this.para_inventoryRowSet1 = crsxi;
    }
    private CachedRowSetXImpl para_inventoryRowSet2 = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPara_inventoryRowSet2() {
        return para_inventoryRowSet2;
    }

    public void setPara_inventoryRowSet2(CachedRowSetXImpl crsxi) {
        this.para_inventoryRowSet2 = crsxi;
    }
    private CachedRowSetXImpl para_inventoryRowSet3 = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPara_inventoryRowSet3() {
        return para_inventoryRowSet3;
    }

    public void setPara_inventoryRowSet3(CachedRowSetXImpl crsxi) {
        this.para_inventoryRowSet3 = crsxi;
    }
    private CachedRowSetXImpl para_inventoryRowSet4 = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPara_inventoryRowSet4() {
        return para_inventoryRowSet4;
    }

    public void setPara_inventoryRowSet4(CachedRowSetXImpl crsxi) {
        this.para_inventoryRowSet4 = crsxi;
    }
    private CachedRowSetXImpl para_inventoryRowSet5 = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPara_inventoryRowSet5() {
        return para_inventoryRowSet5;
    }

    public void setPara_inventoryRowSet5(CachedRowSetXImpl crsxi) {
        this.para_inventoryRowSet5 = crsxi;
    }
    private CachedRowSetXImpl para_inventoryRowSet6 = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPara_inventoryRowSet6() {
        return para_inventoryRowSet6;
    }

    public void setPara_inventoryRowSet6(CachedRowSetXImpl crsxi) {
        this.para_inventoryRowSet6 = crsxi;
    }
    private CachedRowSetXImpl para_inventoryRowSet7 = new CachedRowSetXImpl();

    public CachedRowSetXImpl getPara_inventoryRowSet7() {
        return para_inventoryRowSet7;
    }

    public void setPara_inventoryRowSet7(CachedRowSetXImpl crsxi) {
        this.para_inventoryRowSet7 = crsxi;
    }
    private List<String> labels;

    public List getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }
    private List<Double> data;

    public List getData() {
        return data;
    }

    public void setData(List<Double> data) {
        this.data = data;
    }
    private String realFilePath;
    private static String FILE_URL = "/ampie/frag1/data.txt";
    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public IcePage1() {
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
            log("IcePage1 Initialization Failure", e);
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
        button1_action();
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
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    public String button1_action() {
        log("Button1");
        labels = new ArrayList<String>();
        labels.add(new String("Loaned out"));
        labels.add(new String("Unpacked"));
        labels.add(new String("Packed"));
        labels.add(new String("Inspection"));
        labels.add(new String("Repair"));
        labels.add(new String("Unserviceable"));
        labels.add(new String("Others"));
        labels.add(new String("Returned"));

        Double temp;

        // <editor-fold defaultstate="collapsed" desc="Fragment1">
        try {
            para_inventoryDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{Page1.para_inventoryRowSet}"));
            para_inventoryRowSet.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet.setCommand("SELECT COUNT(*)  FROM para_inventory WHERE `status` = \"loan\"");
            para_inventoryRowSet.setTableName("para_inventory");
            para_inventoryRowSet1.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet1.setCommand("SELECT COUNT(*)  FROM para_inventory WHERE `status` = \"unpacked\"");
            para_inventoryRowSet1.setTableName("para_inventory");
            para_inventoryRowSet2.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet2.setCommand("SELECT COUNT(*)  FROM para_inventory WHERE `status` = \"packed\"");
            para_inventoryRowSet2.setTableName("para_inventory");
            para_inventoryRowSet3.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet3.setCommand("SELECT COUNT(*)  FROM para_inventory WHERE `status` = \"inspection\"");
            para_inventoryRowSet3.setTableName("para_inventory");
            para_inventoryRowSet4.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet4.setCommand("SELECT COUNT(*)  FROM para_inventory WHERE `status` = \"repair\"");
            para_inventoryRowSet4.setTableName("para_inventory");
            para_inventoryRowSet5.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet5.setCommand("SELECT COUNT(*)  FROM para_inventory WHERE `status` = \"unserviceable\"");
            para_inventoryRowSet5.setTableName("para_inventory");
            para_inventoryRowSet6.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet6.setCommand("SELECT COUNT(*)  FROM para_inventory WHERE `status` = \"others\"");
            para_inventoryRowSet6.setTableName("para_inventory");
            para_inventoryRowSet7.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet7.setCommand("SELECT COUNT(*)  FROM para_inventory WHERE `status` = \"returned\"");
            para_inventoryRowSet7.setTableName("para_inventory");
        } catch (Exception e) {
            log(e.toString());
        }

        FILE_URL = "/ampie/frag1/data.txt";

        data = new ArrayList<Double>();
        temp = null;

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet1);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet2);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet3);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet4);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet5);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet6);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet7);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        try {
            ServletContext theApplicationsServletContext = (ServletContext) this.getExternalContext().getContext();
            this.realFilePath = theApplicationsServletContext.getRealPath(FILE_URL);
            File outputData = new File(realFilePath);
            log(outputData.getPath());

            outputData.createNewFile();
            FileWriter fstream = new FileWriter(outputData);
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(labels.get(0) + ";" + data.get(0) + ";;" + "0D8ECF" + "\n");
            out.write(labels.get(1) + ";" + data.get(1) + ";;" + "F8FF01" + "\n");
            out.write(labels.get(2) + ";" + data.get(2) + ";;" + "04D215" + "\n");
            out.write(labels.get(3) + ";" + data.get(3) + ";;" + "FCD202" + "\n");
            out.write(labels.get(4) + ";" + data.get(4) + ";;" + "FF6600" + "\n");
            out.write(labels.get(5) + ";" + data.get(5) + ";;" + "FF0F00" + "\n");
            out.write(labels.get(6) + ";" + data.get(6) + ";;" + "2A0CD0" + "\n");
            out.write(labels.get(7) + ";" + data.get(7) + ";;" + "333333" + "\n");
            out.close();
            fstream.close();
        } catch (Exception e) {
            log(e.toString());
        }
        // </editor-fold>
        // <editor-fold defaultstate="collapsed" desc="Fragment2">
        try {
            para_inventoryDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{IcePage1.para_inventoryRowSet}"));
            para_inventoryRowSet.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet.setCommand(
                    "SELECT COUNT(*)  FROM para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                    "WHERE `status` = \"loan\" AND `reserve` = 0 AND `static` = 1");
            para_inventoryRowSet.setTableName("para_inventory");
            para_inventoryRowSet1.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet1.setCommand(
                    "SELECT COUNT(*)  FROM para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                    "WHERE `status` = \"unpacked\" AND `reserve` = 0 AND `static` = 1");
            para_inventoryRowSet1.setTableName("para_inventory");
            para_inventoryRowSet2.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet2.setCommand(
                    "SELECT COUNT(*)  FROM para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                    "WHERE `status` = \"packed\" AND `reserve` = 0 AND `static` = 1");
            para_inventoryRowSet2.setTableName("para_inventory");
            para_inventoryRowSet3.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet3.setCommand(
                    "SELECT COUNT(*)  FROM para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                    "WHERE `status` = \"inspection\" AND `reserve` = 0 AND `static` = 1");
            para_inventoryRowSet3.setTableName("para_inventory");
            para_inventoryRowSet4.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet4.setCommand(
                    "SELECT COUNT(*)  FROM para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                    "WHERE `status` = \"repair\" AND `reserve` = 0 AND `static` = 1");
            para_inventoryRowSet4.setTableName("para_inventory");
            para_inventoryRowSet5.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet5.setCommand(
                    "SELECT COUNT(*)  FROM para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                    "WHERE `status` = \"unserviceable\" AND `reserve` = 0 AND `static` = 1");
            para_inventoryRowSet5.setTableName("para_inventory");
            para_inventoryRowSet6.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet6.setCommand(
                    "SELECT COUNT(*)  FROM para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                    "WHERE `status` = \"others\" AND `reserve` = 0 AND `static` = 1");
            para_inventoryRowSet6.setTableName("para_inventory");
            para_inventoryRowSet7.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet7.setCommand(
                    "SELECT COUNT(*)  FROM para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                    "WHERE `status` = \"returned\" AND `reserve` = 0 AND `static` = 1");
            para_inventoryRowSet7.setTableName("para_inventory");
        } catch (Exception e) {
            log(e.toString());
        }

        FILE_URL = "/ampie/frag2/data.txt";

        data = new ArrayList<Double>();
        temp = null;

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet1);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet2);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet3);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet4);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet5);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet6);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet7);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        try {
            ServletContext theApplicationsServletContext = (ServletContext) this.getExternalContext().getContext();
            this.realFilePath = theApplicationsServletContext.getRealPath(FILE_URL);
            File outputData = new File(realFilePath);
            log(outputData.getPath());

            outputData.createNewFile();
            FileWriter fstream = new FileWriter(outputData);
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(labels.get(0) + ";" + data.get(0) + ";;" + "0D8ECF" + "\n");
            out.write(labels.get(1) + ";" + data.get(1) + ";;" + "F8FF01" + "\n");
            out.write(labels.get(2) + ";" + data.get(2) + ";;" + "04D215" + "\n");
            out.write(labels.get(3) + ";" + data.get(3) + ";;" + "FCD202" + "\n");
            out.write(labels.get(4) + ";" + data.get(4) + ";;" + "FF6600" + "\n");
            out.write(labels.get(5) + ";" + data.get(5) + ";;" + "FF0F00" + "\n");
            out.write(labels.get(6) + ";" + data.get(6) + ";;" + "2A0CD0" + "\n");
            out.write(labels.get(7) + ";" + data.get(7) + ";;" + "333333" + "\n");
            out.close();
            fstream.close();
        } catch (Exception e) {
            log(e.toString());
        }
        // </editor-fold>
        // <editor-fold defaultstate="collapsed" desc="Fragment3">
        try {
            para_inventoryDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{IcePage1.para_inventoryRowSet}"));
            para_inventoryRowSet.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet.setCommand(
                    "SELECT COUNT(*)  FROM para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                    "WHERE `status` = \"loan\" AND `reserve` = 0 AND `static` = 0");
            para_inventoryRowSet.setTableName("para_inventory");
            para_inventoryRowSet1.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet1.setCommand(
                    "SELECT COUNT(*)  FROM para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                    "WHERE `status` = \"unpacked\" AND `reserve` = 0 AND `static` = 0");
            para_inventoryRowSet1.setTableName("para_inventory");
            para_inventoryRowSet2.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet2.setCommand(
                    "SELECT COUNT(*)  FROM para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                    "WHERE `status` = \"packed\" AND `reserve` = 0 AND `static` = 0");
            para_inventoryRowSet2.setTableName("para_inventory");
            para_inventoryRowSet3.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet3.setCommand(
                    "SELECT COUNT(*)  FROM para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                    "WHERE `status` = \"inspection\" AND `reserve` = 0 AND `static` = 0");
            para_inventoryRowSet3.setTableName("para_inventory");
            para_inventoryRowSet4.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet4.setCommand(
                    "SELECT COUNT(*)  FROM para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                    "WHERE `status` = \"repair\" AND `reserve` = 0 AND `static` = 0");
            para_inventoryRowSet4.setTableName("para_inventory");
            para_inventoryRowSet5.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet5.setCommand(
                    "SELECT COUNT(*)  FROM para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                    "WHERE `status` = \"unserviceable\" AND `reserve` = 0 AND `static` = 0");
            para_inventoryRowSet5.setTableName("para_inventory");
            para_inventoryRowSet6.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet6.setCommand(
                    "SELECT COUNT(*)  FROM para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                    "WHERE `status` = \"others\" AND `reserve` = 0 AND `static` = 0");
            para_inventoryRowSet6.setTableName("para_inventory");
            para_inventoryRowSet7.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet7.setCommand(
                    "SELECT COUNT(*)  FROM para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                    "WHERE `status` = \"returned\" AND `reserve` = 0 AND `static` = 0");
            para_inventoryRowSet7.setTableName("para_inventory");
        } catch (Exception e) {
            log(e.toString());
        }

        FILE_URL = "/ampie/frag3/data.txt";

        data = new ArrayList<Double>();
        temp = null;

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet1);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet2);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet3);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet4);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet5);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet6);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet7);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        try {
            ServletContext theApplicationsServletContext = (ServletContext) this.getExternalContext().getContext();
            this.realFilePath = theApplicationsServletContext.getRealPath(FILE_URL);
            File outputData = new File(realFilePath);
            log(outputData.getPath());

            outputData.createNewFile();
            FileWriter fstream = new FileWriter(outputData);
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(labels.get(0) + ";" + data.get(0) + ";;" + "0D8ECF" + "\n");
            out.write(labels.get(1) + ";" + data.get(1) + ";;" + "F8FF01" + "\n");
            out.write(labels.get(2) + ";" + data.get(2) + ";;" + "04D215" + "\n");
            out.write(labels.get(3) + ";" + data.get(3) + ";;" + "FCD202" + "\n");
            out.write(labels.get(4) + ";" + data.get(4) + ";;" + "FF6600" + "\n");
            out.write(labels.get(5) + ";" + data.get(5) + ";;" + "FF0F00" + "\n");
            out.write(labels.get(6) + ";" + data.get(6) + ";;" + "2A0CD0" + "\n");
            out.write(labels.get(7) + ";" + data.get(7) + ";;" + "333333" + "\n");
            out.close();
            fstream.close();
        } catch (Exception e) {
            log(e.toString());
        }
        // </editor-fold>
        // <editor-fold defaultstate="collapsed" desc="Fragment4">
        try {
            para_inventoryDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{IcePage1.para_inventoryRowSet}"));
            para_inventoryRowSet.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet.setCommand(
                    "SELECT COUNT(*)  FROM para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                    "WHERE `status` = \"loan\" AND `reserve` = 1 AND `static` = 1");
            para_inventoryRowSet.setTableName("para_inventory");
            para_inventoryRowSet1.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet1.setCommand(
                    "SELECT COUNT(*)  FROM para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                    "WHERE `status` = \"unpacked\" AND `reserve` = 1 AND `static` = 1");
            para_inventoryRowSet1.setTableName("para_inventory");
            para_inventoryRowSet2.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet2.setCommand(
                    "SELECT COUNT(*)  FROM para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                    "WHERE `status` = \"packed\" AND `reserve` = 1 AND `static` = 1");
            para_inventoryRowSet2.setTableName("para_inventory");
            para_inventoryRowSet3.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet3.setCommand(
                    "SELECT COUNT(*)  FROM para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                    "WHERE `status` = \"inspection\" AND `reserve` = 1 AND `static` = 1");
            para_inventoryRowSet3.setTableName("para_inventory");
            para_inventoryRowSet4.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet4.setCommand(
                    "SELECT COUNT(*)  FROM para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                    "WHERE `status` = \"repair\" AND `reserve` = 1 AND `static` = 1");
            para_inventoryRowSet4.setTableName("para_inventory");
            para_inventoryRowSet5.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet5.setCommand(
                    "SELECT COUNT(*)  FROM para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                    "WHERE `status` = \"unserviceable\" AND `reserve` = 1 AND `static` = 1");
            para_inventoryRowSet5.setTableName("para_inventory");
            para_inventoryRowSet6.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet6.setCommand(
                    "SELECT COUNT(*)  FROM para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                    "WHERE `status` = \"others\" AND `reserve` = 1 AND `static` = 1");
            para_inventoryRowSet6.setTableName("para_inventory");
            para_inventoryRowSet7.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet7.setCommand(
                    "SELECT COUNT(*)  FROM para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                    "WHERE `status` = \"returned\" AND `reserve` = 1 AND `static` = 1");
            para_inventoryRowSet7.setTableName("para_inventory");
        } catch (Exception e) {
            log(e.toString());
        }

        FILE_URL = "/ampie/frag4/data.txt";

        data = new ArrayList<Double>();
        temp = null;

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet1);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet2);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet3);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet4);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet5);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet6);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet7);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        try {
            ServletContext theApplicationsServletContext = (ServletContext) this.getExternalContext().getContext();
            this.realFilePath = theApplicationsServletContext.getRealPath(FILE_URL);
            File outputData = new File(realFilePath);
            log(outputData.getPath());

            outputData.createNewFile();
            FileWriter fstream = new FileWriter(outputData);
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(labels.get(0) + ";" + data.get(0) + ";;" + "0D8ECF" + "\n");
            out.write(labels.get(1) + ";" + data.get(1) + ";;" + "F8FF01" + "\n");
            out.write(labels.get(2) + ";" + data.get(2) + ";;" + "04D215" + "\n");
            out.write(labels.get(3) + ";" + data.get(3) + ";;" + "FCD202" + "\n");
            out.write(labels.get(4) + ";" + data.get(4) + ";;" + "FF6600" + "\n");
            out.write(labels.get(5) + ";" + data.get(5) + ";;" + "FF0F00" + "\n");
            out.write(labels.get(6) + ";" + data.get(6) + ";;" + "2A0CD0" + "\n");
            out.write(labels.get(7) + ";" + data.get(7) + ";;" + "333333" + "\n");
            out.close();
            fstream.close();
        } catch (Exception e) {
            log(e.toString());
        }
        // </editor-fold>
        // <editor-fold defaultstate="collapsed" desc="Fragment5">
        try {
            para_inventoryDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{IcePage1.para_inventoryRowSet}"));
            para_inventoryRowSet.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet.setCommand(
                    "SELECT COUNT(*)  FROM para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                    "WHERE `status` = \"loan\" AND `reserve` = 1 AND `static` = 0");
            para_inventoryRowSet.setTableName("para_inventory");
            para_inventoryRowSet1.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet1.setCommand(
                    "SELECT COUNT(*)  FROM para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                    "WHERE `status` = \"unpacked\" AND `reserve` = 1 AND `static` = 0");
            para_inventoryRowSet1.setTableName("para_inventory");
            para_inventoryRowSet2.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet2.setCommand(
                    "SELECT COUNT(*)  FROM para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                    "WHERE `status` = \"packed\" AND `reserve` = 1 AND `static` = 0");
            para_inventoryRowSet2.setTableName("para_inventory");
            para_inventoryRowSet3.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet3.setCommand(
                    "SELECT COUNT(*)  FROM para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                    "WHERE `status` = \"inspection\" AND `reserve` = 1 AND `static` = 0");
            para_inventoryRowSet3.setTableName("para_inventory");
            para_inventoryRowSet4.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet4.setCommand(
                    "SELECT COUNT(*)  FROM para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                    "WHERE `status` = \"repair\" AND `reserve` = 1 AND `static` = 0");
            para_inventoryRowSet4.setTableName("para_inventory");
            para_inventoryRowSet5.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet5.setCommand(
                    "SELECT COUNT(*)  FROM para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                    "WHERE `status` = \"unserviceable\" AND `reserve` = 1 AND `static` = 0");
            para_inventoryRowSet5.setTableName("para_inventory");
            para_inventoryRowSet6.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet6.setCommand(
                    "SELECT COUNT(*)  FROM para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                    "WHERE `status` = \"others\" AND `reserve` = 1 AND `static` = 0");
            para_inventoryRowSet6.setTableName("para_inventory");
            para_inventoryRowSet7.setDataSourceName("java:comp/env/jdbc/parachute_system_MySQL");
            para_inventoryRowSet7.setCommand(
                    "SELECT COUNT(*)  FROM para_inventory INNER JOIN para_type ON para_inventory.type_prefix_no=para_type.para_type_no " +
                    "WHERE `status` = \"returned\" AND `reserve` = 1 AND `static` = 0");
            para_inventoryRowSet7.setTableName("para_inventory");
        } catch (Exception e) {
            log(e.toString());
        }

        FILE_URL = "/ampie/frag5/data.txt";

        data = new ArrayList<Double>();
        temp = null;

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet1);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet2);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet3);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet4);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet5);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet6);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        para_inventoryDataProvider.setCachedRowSet(para_inventoryRowSet7);
        para_inventoryDataProvider.refresh();
        temp = new Double(para_inventoryDataProvider.getValue("count(*)").toString());
        data.add(temp);

        try {
            ServletContext theApplicationsServletContext = (ServletContext) this.getExternalContext().getContext();
            this.realFilePath = theApplicationsServletContext.getRealPath(FILE_URL);
            File outputData = new File(realFilePath);
            log(outputData.getPath());

            outputData.createNewFile();
            FileWriter fstream = new FileWriter(outputData);
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(labels.get(0) + ";" + data.get(0) + ";;" + "0D8ECF" + "\n");
            out.write(labels.get(1) + ";" + data.get(1) + ";;" + "F8FF01" + "\n");
            out.write(labels.get(2) + ";" + data.get(2) + ";;" + "04D215" + "\n");
            out.write(labels.get(3) + ";" + data.get(3) + ";;" + "FCD202" + "\n");
            out.write(labels.get(4) + ";" + data.get(4) + ";;" + "FF6600" + "\n");
            out.write(labels.get(5) + ";" + data.get(5) + ";;" + "FF0F00" + "\n");
            out.write(labels.get(6) + ";" + data.get(6) + ";;" + "2A0CD0" + "\n");
            out.write(labels.get(7) + ";" + data.get(7) + ";;" + "333333" + "\n");
            out.close();
            fstream.close();
        } catch (Exception e) {
            log(e.toString());
        }
        // </editor-fold>
        return null;
    }
}

