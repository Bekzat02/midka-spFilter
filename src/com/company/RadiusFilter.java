package com.company;

import com.company.interfaces.IFilter;

import java.util.ArrayList;
import java.util.List;

public class RadiusFilter implements IFilter {

    @Override
    public List<Circle> filter(List<Circle> circles) {
        List<Circle> list=new ArrayList<>();
        for(Circle circle:circles){
            if(circle.radius>3.44){
                list.add(circle);
            }
        }
        return list;
    }
    //
}
