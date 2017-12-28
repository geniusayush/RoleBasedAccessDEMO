# RoleBasedAccessDEMO
a demo program that shows how to design systems

Basically here we are taking 3 components of USER,ROLE,ACTION,RESOURCE.
each resource is maintained by its own service.
to make the service interact for example the resource service needing data from role service 
either we can compute the dependency befre hand and then pass it to the resource or we can pass the link to the role service and let the resource service deal on its own 
