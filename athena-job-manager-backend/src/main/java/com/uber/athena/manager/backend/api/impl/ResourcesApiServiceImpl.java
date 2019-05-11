package com.uber.athena.manager.backend.api.impl;

import com.uber.athena.manager.backend.api.ApiResponseMessage;
import com.uber.athena.manager.backend.api.NotFoundException;
import com.uber.athena.manager.backend.api.ResourcesApiService;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.util.UUID;

@javax.annotation.Generated(
    value = "io.swagger.codegen.languages.JavaJerseyServerCodegen",
    date = "2019-05-11T09:18:17.249-07:00")
public class ResourcesApiServiceImpl extends ResourcesApiService {

  @Override
  public Response createResource(SecurityContext securityContext)
      throws NotFoundException {
    // do some magic!
    return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  @Override
  public Response listResources(UUID jobUUID, SecurityContext securityContext)
      throws NotFoundException {
    // do some magic!
    return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
