package com.shx99717.vaadin.vaadinsampleappwithsprintbootandflowinjava.views.empty;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.shx99717.vaadin.vaadinsampleappwithsprintbootandflowinjava.views.MainLayout;

@PageTitle("Empty")
@Route(value = "empty", layout = MainLayout.class)
public class EmptyView extends Div {

    public EmptyView() {
        addClassName("empty-view");
        add(new Text("Content placeholder"));
    }

}
