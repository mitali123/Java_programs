/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlemaps;
import static com.teamdev.jxbrowser.engine.RenderingMode.*;

import com.teamdev.jxbrowser.browser.Browser;
import com.teamdev.jxbrowser.engine.Engine;
import com.teamdev.jxbrowser.engine.EngineOptions;
import com.teamdev.jxbrowser.view.swing.BrowserView;
import java.awt.BorderLayout; 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class GoogleMaps {

    private static final int MIN_ZOOM = 0;
    private static final int MAX_ZOOM = 21;
    private static final String setMarkerScript =
           "var geocoder = new google.maps.Geocoder();\n" +
"var address = 'Mission Hill';\n" +
"geocoder.geocode({'address': address}, function(results, status) {\n" +
"          if (status === 'OK') {\n" +
"              alert(\"OK\");\n" +
"            map.setCenter(results[0].geometry.location);\n" +
"            var marker = new google.maps.Marker({\n" +
"              map: map,\n" +
"              position: results[0].geometry.location\n" +
"               \n" +
"            });\n" +
"          } else {\n" +
"            alert('Geocode was not successful for the following reason: ' + status);\n" +
"          }\n" +
"});";
            
            
            /*
            " var myLatlng = new google.maps.LatLng(42.342936, -71.099320);\n" +
            " var marker = new google.maps.Marker({\n" +
            " position: myLatlng,\n" +
            " map: map,\n" +
            " title: 'Hello World!'\n" +
            "});"+
            "var myLatlng = new google.maps.LatLng(42.331409, -71.102905);\n" +
            "var marker = new google.maps.Marker({\n" +
            "position: myLatlng,\n" +
            "map: map,\n" +
            "title: 'Hello World!'\n" +
            "});";  */
    


    /**
     * In map.html file default zoom value is set to 4.
     */
    private static int zoomValue = 4;

    public static void main(String[] args) {
        EngineOptions options =
                EngineOptions.newBuilder(HARDWARE_ACCELERATED).build();
        Engine engine = Engine.newInstance(EngineOptions.newBuilder(HARDWARE_ACCELERATED).licenseKey("1BNDHFSC1FTW9AA1S7GXBL973BCKV5YKET0AELN6BPY2SY7GJ8GVGV087US2ECJU0DVPKX").build());
        Browser browser = engine.newBrowser();

        SwingUtilities.invokeLater(() -> {
            BrowserView view = BrowserView.newInstance(browser);

            JButton zoomInButton = new JButton("Zoom In");
            zoomInButton.addActionListener(e -> {
                if (zoomValue < MAX_ZOOM) {
                    browser.mainFrame().ifPresent(frame ->
                            frame.executeJavaScript("map.setZoom(" +
                                    ++zoomValue + ")"));
                }
            });

            JButton zoomOutButton = new JButton("Zoom Out");
            zoomOutButton.addActionListener(e -> {
                if (zoomValue > MIN_ZOOM) {
                    browser.mainFrame().ifPresent(frame ->
                            frame.executeJavaScript("map.setZoom(" +
                                    --zoomValue + ")"));
                }
            });
            System.out.println(setMarkerScript);

            JButton setMarkerButton = new JButton("Search your location");
            setMarkerButton.addActionListener(e ->
                    browser.mainFrame().ifPresent(frame ->
                            frame.executeJavaScript(setMarkerScript)));

            JPanel toolBar = new JPanel();
            toolBar.add(zoomInButton);
            toolBar.add(zoomOutButton);
            toolBar.add(setMarkerButton);

            JFrame frame = new JFrame("Google Maps");
            frame.add(toolBar, BorderLayout.SOUTH);
            frame.add(view, BorderLayout.CENTER);
            frame.setSize(800, 500);
            frame.setVisible(true);

            browser.navigation().loadUrl("file:///C:/Users/manja/Documents/save_our_soul/map.html");
        });
    }
}









