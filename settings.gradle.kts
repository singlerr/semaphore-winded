rootProject.name = "semaphore-enhanced"
/***
 * Manage interactors components
 */
include("interactors:admin")
include("interactors:caller")
include("interactors:callee")
include("interactors:accessor")

include("presenters:admin")
include("presenters:callee")
include("presenters:caller")

include("views:admin")
include("views:callee")
include("views:caller")

include("datagateways")
include("callhandler")
include("controllers:admin")
