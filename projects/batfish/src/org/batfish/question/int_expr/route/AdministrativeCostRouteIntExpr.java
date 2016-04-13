package org.batfish.question.int_expr.route;

import org.batfish.question.Environment;
import org.batfish.question.route_expr.RouteExpr;
import org.batfish.representation.PrecomputedRoute;

public final class AdministrativeCostRouteIntExpr extends RouteIntExpr {

   public AdministrativeCostRouteIntExpr(RouteExpr caller) {
      super(caller);
   }

   @Override
   public Integer evaluate(Environment environment) {
      PrecomputedRoute caller = _caller.evaluate(environment);
      return caller.getAdministrativeCost();
   }

}