package qw8415.library.model.comaparator;

import qw8415.library.model.Publication;

import java.util.Comparator;

public class YearComparator implements Comparator<Publication> {
    @Override
    public int compare(Publication p1, Publication p2) {
        if (p1 == null && p2 == null) return 0;
        else if (p1 == null) return 1;
        else if (p2 == null) return -1;
        Integer year1 = Integer.valueOf(p1.getYear());
        Integer year2 = Integer.valueOf(p2.getYear());
        return -year1.compareTo(year2);
    }
}