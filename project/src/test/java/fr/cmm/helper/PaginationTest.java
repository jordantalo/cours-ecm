package fr.cmm.helper;

import org.junit.Before;
import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;


public class PaginationTest {
    @Test
    public void getPageCountMultiple(){
        Pagination pagination = new Pagination();
        pagination.setPageSize(50);
        pagination.setCount(100);

        assertEquals(2,pagination.getPageCount());
    }

    @Test
    public  void getPageCountNonMultiple(){
        Pagination pagination = new Pagination();
        pagination.setPageSize(40);
        pagination.setCount(20);

        assertEquals(1,pagination.getPageCount());
    }

    @Test
    public  void getPageCountBords(){
        Pagination pagination = new Pagination();
        pagination.setPageSize(40);
        pagination.setCount(0);

        assertEquals(pagination.getPageCount(),1);
    }


    @Test
    public void getPages(){
        Pagination pagination = new Pagination();
        pagination.setPageSize(40);
        pagination.setCount(100);

        assertEquals(asList(1,2,3), pagination.getPages());

    }
}