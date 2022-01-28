package com.aor.numbers;

import java.util.List;

public class ListFiltered{

    GenericListFilter usedFilter;

    public ListFiltered(GenericListFilter filter){
        usedFilter = filter;
    }
    
    public List<Integer> filter(List<Integer> list){
        List<Integer> filteredList = null;
        for(Integer i: list){
            if(usedFilter.accept(i)){
                filteredList.add(i);
            }
        }
        return filteredList;
    }

}
