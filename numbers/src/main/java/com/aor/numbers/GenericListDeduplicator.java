package com.aor.numbers;

import java.util.List;

interface GenericListDeduplicator{
    public List<Integer> deduplicate(List<Integer> list, GenericListSorter listSorter);
}