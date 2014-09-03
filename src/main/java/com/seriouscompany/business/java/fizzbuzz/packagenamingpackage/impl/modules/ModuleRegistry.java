package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules;

import java.util.ServiceLoader;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.modules.Module;

public class ModuleRegistry {
    public static List<Module> getModules() {
        if (modules == null) {
            modules = new ArrayList<Module>();
            for (Module m : moduleLoader) {
                modules.add(m);
            }
            Collections.sort(modules, new Comparator<Module>() {
                @Override
                public int compare(Module m1, Module m2) {
                    return m1.getPriority() - m2.getPriority();
                }
            });
        }
        return modules;
    }

    private static ServiceLoader<Module> moduleLoader = ServiceLoader.load(Module.class);
    private static List<Module> modules;
}
