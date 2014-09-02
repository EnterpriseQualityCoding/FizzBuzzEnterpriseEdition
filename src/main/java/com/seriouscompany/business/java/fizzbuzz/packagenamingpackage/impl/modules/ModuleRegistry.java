package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.modules;

import java.util.ServiceLoader;
import java.util.List;
import java.util.ArrayList;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.modules.Module;

public class ModuleRegistry {
    public static List<Module> getModules() {
        if (modules == null) {
            modules = new ArrayList<Module>();
            for (Module m : moduleLoader) {
                modules.add(m);
            }
        }
        return modules;
    }

    private static ServiceLoader<Module> moduleLoader = ServiceLoader.load(Module.class);
    private static List<Module> modules;
}
