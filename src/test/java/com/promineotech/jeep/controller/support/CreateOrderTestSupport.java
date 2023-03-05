package com.promineotech.jeep.controller.support;

public class CreateOrderTestSupport extends BaseTest {
 /**
  * 
  * @return
  */ 
  protected String createOrderBody() {
    //@formatter:off
    return "{\n"
        + " \"customer\":\"ATTAWAY_HECKTOR\",\n"
        + " \"model\":\"GRAND_CHEROKEE\",\n"
        + " \"trim\":\"80th Anniversary\",\n"
        + " \"doors\":4,\n"
        + " \"color\":\"EXT_STING_GRAY\",\n"
        + " \"engine\":\"3_6_HYBRID\",\n"
        + " \"tire\":\"35_NITTO\",\n"
        + " \"options\":[\n"
        + "  \"DOOR_MOPAR_REINFORCE\",\n"
        + "  \"EXT_MOPAR_KEYLESS\",\n"
        + "  \"EXT_MOPAR_COLOR_FLARE\",\n"
        + "  \"EXT_FISHBONE_FRONT\",\n"
        + "  \"EXT_QUAD_QRC_FR\",\n"
        + "  \"TOP_MOPAR_TWILL\"\n"
        + "  ]\n"
        + "}";
   //@formatter:off
  }
}
