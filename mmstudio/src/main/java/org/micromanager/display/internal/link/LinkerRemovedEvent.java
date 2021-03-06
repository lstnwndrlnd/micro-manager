///////////////////////////////////////////////////////////////////////////////
//PROJECT:       Micro-Manager
//SUBSYSTEM:     Display implementation
//-----------------------------------------------------------------------------
//
// AUTHOR:       Chris Weisiger, 2015
//
// COPYRIGHT:    University of California, San Francisco, 2015
//
// LICENSE:      This file is distributed under the BSD license.
//               License text is included with the source distribution.
//
//               This file is distributed in the hope that it will be useful,
//               but WITHOUT ANY WARRANTY; without even the implied warranty
//               of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
//
//               IN NO EVENT SHALL THE COPYRIGHT OWNER OR
//               CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
//               INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES.

package org.micromanager.display.internal.link;

/**
 * This class signifies that a SettingsLinker is being removed from the GUI.
 * It's only needed when a GUI component is removed without the display that
 * contains it going away, since otherwise we use the DisplayDestroyedEvent.
 */
public final class LinkerRemovedEvent {
   private SettingsLinker linker_;

   public LinkerRemovedEvent(SettingsLinker linker) {
      linker_ = linker;
   }

   public SettingsLinker getLinker() {
      return linker_;
   }
}
