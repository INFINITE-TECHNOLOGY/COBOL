package io.infinite.cobol

class CobolGroup {

    List<CobolGroup> childGroups = new ArrayList<>()

    CobolGroup parentGroup

    String pictureString

    Boolean isSigned = false

    Integer length

    Integer scale

    Integer comp3length

    String usageType

    Integer depth

    String groupName

    List<Byte> rawData = new ArrayList<Byte>()

}
