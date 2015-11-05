package org.batfish.nxtnet;

import org.batfish.common.BatfishException;
import org.batfish.representation.Ip;

public final class LongColumn extends BaseColumn<Long> {

   public LongColumn(Long[] items) {
      super(items, ColumnType.LONG);
   }

   @Override
   public Object getItem(int i, EntityTable entityTable, LBValueType valueType) {
      Long l = _items.get(i);
      switch (valueType) {
      case ENTITY_INDEX_BGP_ADVERTISEMENT:
         return entityTable.getBgpAdvertisement(l);

      case ENTITY_INDEX_FLOW:
         return entityTable.getFlow(l);

      case ENTITY_INDEX_NETWORK:
         return entityTable.getNetwork(l);

      case ENTITY_INDEX_ROUTE:
         return entityTable.getRoute(l);

      case ENTITY_REF_IP:
         return new Ip(l);

      case ENTITY_INDEX_INT:
      case ENTITY_REF_AUTONOMOUS_SYSTEM:
      case ENTITY_REF_INT:
      case INT:
         return l;

      case ENTITY_REF_ADVERTISEMENT_TYPE:
      case ENTITY_REF_AS_PATH:
      case ENTITY_REF_FLOW_TAG:
      case ENTITY_REF_INTERFACE:
      case ENTITY_REF_NODE:
      case ENTITY_REF_ORIGIN_TYPE:
      case ENTITY_REF_POLICY_MAP:
      case ENTITY_REF_ROUTING_PROTOCOL:
      case ENTITY_REF_STRING:
      case FLOAT:
      case STRING:
      default:
         throw new BatfishException("invalid value type");

      }
   }

}