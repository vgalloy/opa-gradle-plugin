package com.bisnode.opa;

import org.gradle.api.Project;
import org.gradle.testfixtures.ProjectBuilder;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StopOpaTaskTest {

    private Project project;

    @Before
    public void before() {
        project = ProjectBuilder.builder().build();
        project.getPluginManager().apply("com.bisnode.opa");
    }

    @Test
    public void taskIsInOpaGroup() {
        StopOpaTask task = (StopOpaTask) project.getTasks().getByName("stopOpa");
        assertThat(task.getGroup(), is("opa"));
    }

}
