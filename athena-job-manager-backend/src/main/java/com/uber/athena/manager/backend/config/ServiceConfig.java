/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.uber.athena.manager.backend.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

public class ServiceConfig {
  private static final ObjectMapper MAPPER = new ObjectMapper(new YAMLFactory());

  /**
   * The name of the class that persists the data of jobs.
   */
  @JsonProperty("job.store.class")
  private final String jobStoreClass;

  /**
   * The endpoint that the Athena job manager master should listen to.
   */
  @JsonProperty("master.uri")
  private final String masterUri;

  /**
   * Extra configurations that can be used to customize the system.
   */
  @JsonProperty("extra.configs")
  private final Map<String, ?> extraConfigs;

  public ServiceConfig() {
    this.jobStoreClass = null;
    this.masterUri = null;
    this.extraConfigs = Collections.emptyMap();
  }

  public static ServiceConfig load(File file) throws IOException {
    return MAPPER.readValue(file, ServiceConfig.class);
  }

  public String getJobStoreClass() {
    return jobStoreClass;
  }

  public String getMasterUri() {
    return masterUri;
  }

  public Map<String, ?> getExtraConfigs() {
    return extraConfigs;
  }
}
