package com.siraaApp.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route

public class MyView extends VerticalLayout {
    @Autowired
    private final Service service = new Service();

    public MyView() {
        setMargin(true);
        setSpacing(true);

        // H1 title = new H1("Start");
        String json = service.showTitle();
        H2 label = new H2();
        label.setText(json);

        add(label);

    }

}
