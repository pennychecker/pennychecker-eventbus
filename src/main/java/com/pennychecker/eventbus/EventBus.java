/**
 * BSD License
 * Copyright (c) David Peterson
 * All rights reserved.
 */
package com.pennychecker.eventbus;

import com.pennychecker.eventbus.Event.Type;

/**
 * An interface providing minimal access to an {@link EventHandler} manager.
 * 
 * Rather than being attached to a single object, an EventBus provides a central
 * pathway to send events across the whole application.
 * 
 * @author David Peterson
 * 
 */
public interface EventBus {
	<H extends EventHandler> HandlerRegistration addHandler(Type<H> type,
			H handler);

	void fireEvent(Event<?> event);

	<H extends EventHandler> H getHandler(Type<H> type, int index);

	int getHandlerCount(Type<?> type);

	boolean isEventHandled(Type<?> e);
}
