/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.github.githubdownloader.core;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author Davide
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class GithubUrlBuilderTest
{

    public GithubUrlBuilderTest()
    {
    }

    @BeforeClass
    public static void setUpClass()
    {
    }

    @AfterClass
    public static void tearDownClass()
    {
    }

    @Before
    public void setUp()
    {
    }

    @After
    public void tearDown()
    {
    }

    /**
     * Test of setUrl method, of class GithubUrlBuilder.
     */
    @Test
    public void testSetCustomUrl()
    {
        String url = "http://github.example.com";
        GithubUrlBuilder instance = new GithubUrlBuilder()
            .setUrl(url)
            .setOrganization("test");
        String expResult = "http://github.example.com/api/v3/orgs/test/repos";
        assertEquals(expResult, instance.build());
    }

    @Test
    public void testDefaultUrl()
    {
        GithubUrlBuilder instance = new GithubUrlBuilder()
            .setOrganization("test");
        String expResult = "https://api.github.com/orgs/test/repos";
        assertEquals(expResult, instance.build());
    }

    /**
     * Test of setType method, of class GithubUrlBuilder.
     */
    @Test
    @Ignore
    public void testSetType()
    {
        System.out.println("setType");
        GithubEnum type = null;
        GithubUrlBuilder instance = new GithubUrlBuilder();
        GithubUrlBuilder expResult = null;
        GithubUrlBuilder result = instance.setType(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrganization method, of class GithubUrlBuilder.
     */
    @Test
    @Ignore
    public void testSetOrganization()
    {
        System.out.println("setOrganization");
        String organization = "";
        GithubUrlBuilder instance = new GithubUrlBuilder();
        GithubUrlBuilder expResult = null;
        GithubUrlBuilder result = instance.setOrganization(organization);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of build method, of class GithubUrlBuilder.
     */
    @Test
    @Ignore
    public void testBuild()
    {
        System.out.println("build");
        GithubUrlBuilder instance = new GithubUrlBuilder();
        String expResult = "";
        String result = instance.build();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class GithubUrlBuilder.
     */
    @Test
    @Ignore
    public void testGetType()
    {
        System.out.println("getType");
        GithubUrlBuilder instance = new GithubUrlBuilder();
        GithubEnum expResult = null;
        GithubEnum result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
