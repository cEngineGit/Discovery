package com.nepxion.discovery.plugin.strategy.starter.agent.core.plugin;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 *
 * @author zifeihan
 * @version 1.0
 */

import com.nepxion.discovery.plugin.strategy.starter.agent.core.callback.TransformTemplate;

public abstract class Plugin {

    public abstract void install(TransformTemplate transformTemplate);
}