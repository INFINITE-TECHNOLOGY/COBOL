package io.infinite.cobol


import io.proleap.cobol.asg.metamodel.data.datadescription.DataDescriptionEntry

class CobolStackElement {

    CobolStackElement prev

    Integer level = 0

    Integer depth = 0

    CobolStackElement next

    DataDescriptionEntry entry

    Boolean redefine = false
    String redefineWhat
    Boolean reoccur = false
    BigDecimal reoccurHowMany

    CobolStackElement push(DataDescriptionEntry entry) {
        this.next = new CobolStackElement()
        this.next.level = entry.levelNumber
        this.next.entry = entry
        this.next.prev = this
        this.next.depth = this.depth + 1
        return this.next
    }

    CobolStackElement pop() {
        return this.prev
    }

}
