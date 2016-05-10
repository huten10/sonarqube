/*
 * SonarQube
 * Copyright (C) 2009-2016 SonarSource SA
 * mailto:contact AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonar.api.batch.postjob;

import org.sonar.api.batch.postjob.issue.PostJobIssue;
import org.sonar.api.config.Settings;

/**
 * See {@link PostJob#execute(PostJobContext)}
 * @since 5.2
 */
public interface PostJobContext {

  /**
   * Get settings of the current project.
   */
  Settings settings();

  // ----------- Only available in preview mode --------------

  /**
   * All the unresolved issues of the project, including the issues reported by end-users.
   */
  Iterable<PostJobIssue> issues();

  /**
   * All the issues of this project that have been marked as resolved during this scan
   */
  Iterable<PostJobIssue> resolvedIssues();

}
