package io.infinite.cobol

import groovy.util.logging.Slf4j
import io.proleap.cobol.CobolBaseVisitor
import io.proleap.cobol.CobolParser

@Slf4j
//@BlackBox(level = CarburetorLevel.ERROR)
class CobolVisitorUnsupported extends CobolBaseVisitor<Boolean> {

    void unsupported(Object a) {
        throw new CobolExceptionCompile("Unsupported COBOL grammar: " + a.getClass().getSimpleName())
    }

    @Override
    Boolean visitStartRule(CobolParser.StartRuleContext ctx) {
        unsupported(ctx)
        //return super.visitStartRule(ctx)
    }

    @Override
    Boolean visitEndProgramStatement(CobolParser.EndProgramStatementContext ctx) {
        unsupported(ctx)
        //return super.visitEndProgramStatement(ctx)
    }

    @Override
    Boolean visitIdentificationDivisionBody(CobolParser.IdentificationDivisionBodyContext ctx) {
        unsupported(ctx)
        //return super.visitIdentificationDivisionBody(ctx)
    }

    @Override
    Boolean visitAuthorParagraph(CobolParser.AuthorParagraphContext ctx) {
        unsupported(ctx)
        //return super.visitAuthorParagraph(ctx)
    }

    @Override
    Boolean visitInstallationParagraph(CobolParser.InstallationParagraphContext ctx) {
        unsupported(ctx)
        //return super.visitInstallationParagraph(ctx)
    }

    @Override
    Boolean visitDateWrittenParagraph(CobolParser.DateWrittenParagraphContext ctx) {
        unsupported(ctx)
        //return super.visitDateWrittenParagraph(ctx)
    }

    @Override
    Boolean visitDateCompiledParagraph(CobolParser.DateCompiledParagraphContext ctx) {
        unsupported(ctx)
        //return super.visitDateCompiledParagraph(ctx)
    }

    @Override
    Boolean visitSecurityParagraph(CobolParser.SecurityParagraphContext ctx) {
        unsupported(ctx)
        //return super.visitSecurityParagraph(ctx)
    }

    @Override
    Boolean visitRemarksParagraph(CobolParser.RemarksParagraphContext ctx) {
        unsupported(ctx)
        //return super.visitRemarksParagraph(ctx)
    }

    @Override
    Boolean visitSourceComputerParagraph(CobolParser.SourceComputerParagraphContext ctx) {
        unsupported(ctx)
        //return super.visitSourceComputerParagraph(ctx)
    }

    @Override
    Boolean visitObjectComputerParagraph(CobolParser.ObjectComputerParagraphContext ctx) {
        unsupported(ctx)
        //return super.visitObjectComputerParagraph(ctx)
    }

    @Override
    Boolean visitObjectComputerClause(CobolParser.ObjectComputerClauseContext ctx) {
        unsupported(ctx)
        //return super.visitObjectComputerClause(ctx)
    }

    @Override
    Boolean visitMemorySizeClause(CobolParser.MemorySizeClauseContext ctx) {
        unsupported(ctx)
        //return super.visitMemorySizeClause(ctx)
    }

    @Override
    Boolean visitDiskSizeClause(CobolParser.DiskSizeClauseContext ctx) {
        unsupported(ctx)
        //return super.visitDiskSizeClause(ctx)
    }

    @Override
    Boolean visitCollatingSequenceClause(CobolParser.CollatingSequenceClauseContext ctx) {
        unsupported(ctx)
        //return super.visitCollatingSequenceClause(ctx)
    }

    @Override
    Boolean visitCollatingSequenceClauseAlphanumeric(CobolParser.CollatingSequenceClauseAlphanumericContext ctx) {
        unsupported(ctx)
        //return super.visitCollatingSequenceClauseAlphanumeric(ctx)
    }

    @Override
    Boolean visitCollatingSequenceClauseNational(CobolParser.CollatingSequenceClauseNationalContext ctx) {
        unsupported(ctx)
        //return super.visitCollatingSequenceClauseNational(ctx)
    }

    @Override
    Boolean visitSegmentLimitClause(CobolParser.SegmentLimitClauseContext ctx) {
        unsupported(ctx)
        //return super.visitSegmentLimitClause(ctx)
    }

    @Override
    Boolean visitCharacterSetClause(CobolParser.CharacterSetClauseContext ctx) {
        unsupported(ctx)
        //return super.visitCharacterSetClause(ctx)
    }

    @Override
    Boolean visitAlphabetClause(CobolParser.AlphabetClauseContext ctx) {
        unsupported(ctx)
        //return super.visitAlphabetClause(ctx)
    }

    @Override
    Boolean visitAlphabetClauseFormat1(CobolParser.AlphabetClauseFormat1Context ctx) {
        unsupported(ctx)
        //return super.visitAlphabetClauseFormat1(ctx)
    }

    @Override
    Boolean visitAlphabetLiterals(CobolParser.AlphabetLiteralsContext ctx) {
        unsupported(ctx)
        //return super.visitAlphabetLiterals(ctx)
    }

    @Override
    Boolean visitAlphabetThrough(CobolParser.AlphabetThroughContext ctx) {
        unsupported(ctx)
        //return super.visitAlphabetThrough(ctx)
    }

    @Override
    Boolean visitAlphabetAlso(CobolParser.AlphabetAlsoContext ctx) {
        unsupported(ctx)
        //return super.visitAlphabetAlso(ctx)
    }

    @Override
    Boolean visitAlphabetClauseFormat2(CobolParser.AlphabetClauseFormat2Context ctx) {
        unsupported(ctx)
        //return super.visitAlphabetClauseFormat2(ctx)
    }

    @Override
    Boolean visitChannelClause(CobolParser.ChannelClauseContext ctx) {
        unsupported(ctx)
        //return super.visitChannelClause(ctx)
    }

    @Override
    Boolean visitClassClause(CobolParser.ClassClauseContext ctx) {
        unsupported(ctx)
        //return super.visitClassClause(ctx)
    }

    @Override
    Boolean visitClassClauseThrough(CobolParser.ClassClauseThroughContext ctx) {
        unsupported(ctx)
        //return super.visitClassClauseThrough(ctx)
    }

    @Override
    Boolean visitClassClauseFrom(CobolParser.ClassClauseFromContext ctx) {
        unsupported(ctx)
        //return super.visitClassClauseFrom(ctx)
    }

    @Override
    Boolean visitClassClauseTo(CobolParser.ClassClauseToContext ctx) {
        unsupported(ctx)
        //return super.visitClassClauseTo(ctx)
    }

    @Override
    Boolean visitCurrencySignClause(CobolParser.CurrencySignClauseContext ctx) {
        unsupported(ctx)
        //return super.visitCurrencySignClause(ctx)
    }

    @Override
    Boolean visitDefaultComputationalSignClause(CobolParser.DefaultComputationalSignClauseContext ctx) {
        unsupported(ctx)
        //return super.visitDefaultComputationalSignClause(ctx)
    }

    @Override
    Boolean visitDefaultDisplaySignClause(CobolParser.DefaultDisplaySignClauseContext ctx) {
        unsupported(ctx)
        //return super.visitDefaultDisplaySignClause(ctx)
    }

    @Override
    Boolean visitEnvironmentSwitchNameClause(CobolParser.EnvironmentSwitchNameClauseContext ctx) {
        unsupported(ctx)
        //return super.visitEnvironmentSwitchNameClause(ctx)
    }

    @Override
    Boolean visitEnvironmentSwitchNameSpecialNamesStatusPhrase(CobolParser.EnvironmentSwitchNameSpecialNamesStatusPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitEnvironmentSwitchNameSpecialNamesStatusPhrase(ctx)
    }

    @Override
    Boolean visitOdtClause(CobolParser.OdtClauseContext ctx) {
        unsupported(ctx)
        //return super.visitOdtClause(ctx)
    }

    @Override
    Boolean visitReserveNetworkClause(CobolParser.ReserveNetworkClauseContext ctx) {
        unsupported(ctx)
        //return super.visitReserveNetworkClause(ctx)
    }

    @Override
    Boolean visitSymbolicCharactersClause(CobolParser.SymbolicCharactersClauseContext ctx) {
        unsupported(ctx)
        //return super.visitSymbolicCharactersClause(ctx)
    }

    @Override
    Boolean visitSymbolicCharacters(CobolParser.SymbolicCharactersContext ctx) {
        unsupported(ctx)
        //return super.visitSymbolicCharacters(ctx)
    }

    @Override
    Boolean visitInputOutputSectionParagraph(CobolParser.InputOutputSectionParagraphContext ctx) {
        unsupported(ctx)
        //return super.visitInputOutputSectionParagraph(ctx)
    }

    @Override
    Boolean visitFileControlParagraph(CobolParser.FileControlParagraphContext ctx) {
        unsupported(ctx)
        //return super.visitFileControlParagraph(ctx)
    }

    @Override
    Boolean visitFileControlEntry(CobolParser.FileControlEntryContext ctx) {
        unsupported(ctx)
        //return super.visitFileControlEntry(ctx)
    }

    @Override
    Boolean visitSelectClause(CobolParser.SelectClauseContext ctx) {
        unsupported(ctx)
        //return super.visitSelectClause(ctx)
    }

    @Override
    Boolean visitFileControlClause(CobolParser.FileControlClauseContext ctx) {
        unsupported(ctx)
        //return super.visitFileControlClause(ctx)
    }

    @Override
    Boolean visitAssignClause(CobolParser.AssignClauseContext ctx) {
        unsupported(ctx)
        //return super.visitAssignClause(ctx)
    }

    @Override
    Boolean visitReserveClause(CobolParser.ReserveClauseContext ctx) {
        unsupported(ctx)
        //return super.visitReserveClause(ctx)
    }

    @Override
    Boolean visitOrganizationClause(CobolParser.OrganizationClauseContext ctx) {
        unsupported(ctx)
        //return super.visitOrganizationClause(ctx)
    }

    @Override
    Boolean visitPaddingCharacterClause(CobolParser.PaddingCharacterClauseContext ctx) {
        unsupported(ctx)
        //return super.visitPaddingCharacterClause(ctx)
    }

    @Override
    Boolean visitRecordDelimiterClause(CobolParser.RecordDelimiterClauseContext ctx) {
        unsupported(ctx)
        //return super.visitRecordDelimiterClause(ctx)
    }

    @Override
    Boolean visitAccessModeClause(CobolParser.AccessModeClauseContext ctx) {
        unsupported(ctx)
        //return super.visitAccessModeClause(ctx)
    }

    @Override
    Boolean visitRecordKeyClause(CobolParser.RecordKeyClauseContext ctx) {
        unsupported(ctx)
        //return super.visitRecordKeyClause(ctx)
    }

    @Override
    Boolean visitAlternateRecordKeyClause(CobolParser.AlternateRecordKeyClauseContext ctx) {
        unsupported(ctx)
        //return super.visitAlternateRecordKeyClause(ctx)
    }

    @Override
    Boolean visitPasswordClause(CobolParser.PasswordClauseContext ctx) {
        unsupported(ctx)
        //return super.visitPasswordClause(ctx)
    }

    @Override
    Boolean visitFileStatusClause(CobolParser.FileStatusClauseContext ctx) {
        unsupported(ctx)
        //return super.visitFileStatusClause(ctx)
    }

    @Override
    Boolean visitRelativeKeyClause(CobolParser.RelativeKeyClauseContext ctx) {
        unsupported(ctx)
        //return super.visitRelativeKeyClause(ctx)
    }

    @Override
    Boolean visitIoControlParagraph(CobolParser.IoControlParagraphContext ctx) {
        unsupported(ctx)
        //return super.visitIoControlParagraph(ctx)
    }

    @Override
    Boolean visitIoControlClause(CobolParser.IoControlClauseContext ctx) {
        unsupported(ctx)
        //return super.visitIoControlClause(ctx)
    }

    @Override
    Boolean visitRerunClause(CobolParser.RerunClauseContext ctx) {
        unsupported(ctx)
        //return super.visitRerunClause(ctx)
    }

    @Override
    Boolean visitRerunEveryRecords(CobolParser.RerunEveryRecordsContext ctx) {
        unsupported(ctx)
        //return super.visitRerunEveryRecords(ctx)
    }

    @Override
    Boolean visitRerunEveryOf(CobolParser.RerunEveryOfContext ctx) {
        unsupported(ctx)
        //return super.visitRerunEveryOf(ctx)
    }

    @Override
    Boolean visitRerunEveryClock(CobolParser.RerunEveryClockContext ctx) {
        unsupported(ctx)
        //return super.visitRerunEveryClock(ctx)
    }

    @Override
    Boolean visitSameClause(CobolParser.SameClauseContext ctx) {
        unsupported(ctx)
        //return super.visitSameClause(ctx)
    }

    @Override
    Boolean visitMultipleFileClause(CobolParser.MultipleFileClauseContext ctx) {
        unsupported(ctx)
        //return super.visitMultipleFileClause(ctx)
    }

    @Override
    Boolean visitMultipleFilePosition(CobolParser.MultipleFilePositionContext ctx) {
        unsupported(ctx)
        //return super.visitMultipleFilePosition(ctx)
    }

    @Override
    Boolean visitCommitmentControlClause(CobolParser.CommitmentControlClauseContext ctx) {
        unsupported(ctx)
        //return super.visitCommitmentControlClause(ctx)
    }

    @Override
    Boolean visitFileSection(CobolParser.FileSectionContext ctx) {
        unsupported(ctx)
        //return super.visitFileSection(ctx)
    }

    @Override
    Boolean visitFileDescriptionEntry(CobolParser.FileDescriptionEntryContext ctx) {
        unsupported(ctx)
        //return super.visitFileDescriptionEntry(ctx)
    }

    @Override
    Boolean visitFileDescriptionEntryClause(CobolParser.FileDescriptionEntryClauseContext ctx) {
        unsupported(ctx)
        //return super.visitFileDescriptionEntryClause(ctx)
    }

    @Override
    Boolean visitExternalClause(CobolParser.ExternalClauseContext ctx) {
        unsupported(ctx)
        //return super.visitExternalClause(ctx)
    }

    @Override
    Boolean visitGlobalClause(CobolParser.GlobalClauseContext ctx) {
        unsupported(ctx)
        //return super.visitGlobalClause(ctx)
    }

    @Override
    Boolean visitBlockContainsClause(CobolParser.BlockContainsClauseContext ctx) {
        unsupported(ctx)
        //return super.visitBlockContainsClause(ctx)
    }

    @Override
    Boolean visitBlockContainsTo(CobolParser.BlockContainsToContext ctx) {
        unsupported(ctx)
        //return super.visitBlockContainsTo(ctx)
    }

    @Override
    Boolean visitRecordContainsClause(CobolParser.RecordContainsClauseContext ctx) {
        unsupported(ctx)
        //return super.visitRecordContainsClause(ctx)
    }

    @Override
    Boolean visitRecordContainsClauseFormat1(CobolParser.RecordContainsClauseFormat1Context ctx) {
        unsupported(ctx)
        //return super.visitRecordContainsClauseFormat1(ctx)
    }

    @Override
    Boolean visitRecordContainsClauseFormat2(CobolParser.RecordContainsClauseFormat2Context ctx) {
        unsupported(ctx)
        //return super.visitRecordContainsClauseFormat2(ctx)
    }

    @Override
    Boolean visitRecordContainsClauseFormat3(CobolParser.RecordContainsClauseFormat3Context ctx) {
        unsupported(ctx)
        //return super.visitRecordContainsClauseFormat3(ctx)
    }

    @Override
    Boolean visitRecordContainsTo(CobolParser.RecordContainsToContext ctx) {
        unsupported(ctx)
        //return super.visitRecordContainsTo(ctx)
    }

    @Override
    Boolean visitLabelRecordsClause(CobolParser.LabelRecordsClauseContext ctx) {
        unsupported(ctx)
        //return super.visitLabelRecordsClause(ctx)
    }

    @Override
    Boolean visitValueOfClause(CobolParser.ValueOfClauseContext ctx) {
        unsupported(ctx)
        //return super.visitValueOfClause(ctx)
    }

    @Override
    Boolean visitValuePair(CobolParser.ValuePairContext ctx) {
        unsupported(ctx)
        //return super.visitValuePair(ctx)
    }

    @Override
    Boolean visitDataRecordsClause(CobolParser.DataRecordsClauseContext ctx) {
        unsupported(ctx)
        //return super.visitDataRecordsClause(ctx)
    }

    @Override
    Boolean visitLinageClause(CobolParser.LinageClauseContext ctx) {
        unsupported(ctx)
        //return super.visitLinageClause(ctx)
    }

    @Override
    Boolean visitLinageAt(CobolParser.LinageAtContext ctx) {
        unsupported(ctx)
        //return super.visitLinageAt(ctx)
    }

    @Override
    Boolean visitLinageFootingAt(CobolParser.LinageFootingAtContext ctx) {
        unsupported(ctx)
        //return super.visitLinageFootingAt(ctx)
    }

    @Override
    Boolean visitLinageLinesAtTop(CobolParser.LinageLinesAtTopContext ctx) {
        unsupported(ctx)
        //return super.visitLinageLinesAtTop(ctx)
    }

    @Override
    Boolean visitLinageLinesAtBottom(CobolParser.LinageLinesAtBottomContext ctx) {
        unsupported(ctx)
        //return super.visitLinageLinesAtBottom(ctx)
    }

    @Override
    Boolean visitRecordingModeClause(CobolParser.RecordingModeClauseContext ctx) {
        unsupported(ctx)
        //return super.visitRecordingModeClause(ctx)
    }

    @Override
    Boolean visitModeStatement(CobolParser.ModeStatementContext ctx) {
        unsupported(ctx)
        //return super.visitModeStatement(ctx)
    }

    @Override
    Boolean visitCodeSetClause(CobolParser.CodeSetClauseContext ctx) {
        unsupported(ctx)
        //return super.visitCodeSetClause(ctx)
    }

    @Override
    Boolean visitReportClause(CobolParser.ReportClauseContext ctx) {
        unsupported(ctx)
        //return super.visitReportClause(ctx)
    }

    @Override
    Boolean visitDataBaseSection(CobolParser.DataBaseSectionContext ctx) {
        unsupported(ctx)
        //return super.visitDataBaseSection(ctx)
    }

    @Override
    Boolean visitDataBaseSectionEntry(CobolParser.DataBaseSectionEntryContext ctx) {
        unsupported(ctx)
        //return super.visitDataBaseSectionEntry(ctx)
    }

    @Override
    Boolean visitLinkageSection(CobolParser.LinkageSectionContext ctx) {
        unsupported(ctx)
        //return super.visitLinkageSection(ctx)
    }

    @Override
    Boolean visitCommunicationSection(CobolParser.CommunicationSectionContext ctx) {
        unsupported(ctx)
        //return super.visitCommunicationSection(ctx)
    }

    @Override
    Boolean visitCommunicationDescriptionEntry(CobolParser.CommunicationDescriptionEntryContext ctx) {
        unsupported(ctx)
        //return super.visitCommunicationDescriptionEntry(ctx)
    }

    @Override
    Boolean visitCommunicationDescriptionEntryFormat1(CobolParser.CommunicationDescriptionEntryFormat1Context ctx) {
        unsupported(ctx)
        //return super.visitCommunicationDescriptionEntryFormat1(ctx)
    }

    @Override
    Boolean visitCommunicationDescriptionEntryFormat2(CobolParser.CommunicationDescriptionEntryFormat2Context ctx) {
        unsupported(ctx)
        //return super.visitCommunicationDescriptionEntryFormat2(ctx)
    }

    @Override
    Boolean visitCommunicationDescriptionEntryFormat3(CobolParser.CommunicationDescriptionEntryFormat3Context ctx) {
        unsupported(ctx)
        //return super.visitCommunicationDescriptionEntryFormat3(ctx)
    }

    @Override
    Boolean visitDestinationCountClause(CobolParser.DestinationCountClauseContext ctx) {
        unsupported(ctx)
        //return super.visitDestinationCountClause(ctx)
    }

    @Override
    Boolean visitDestinationTableClause(CobolParser.DestinationTableClauseContext ctx) {
        unsupported(ctx)
        //return super.visitDestinationTableClause(ctx)
    }

    @Override
    Boolean visitEndKeyClause(CobolParser.EndKeyClauseContext ctx) {
        unsupported(ctx)
        //return super.visitEndKeyClause(ctx)
    }

    @Override
    Boolean visitErrorKeyClause(CobolParser.ErrorKeyClauseContext ctx) {
        unsupported(ctx)
        //return super.visitErrorKeyClause(ctx)
    }

    @Override
    Boolean visitMessageCountClause(CobolParser.MessageCountClauseContext ctx) {
        unsupported(ctx)
        //return super.visitMessageCountClause(ctx)
    }

    @Override
    Boolean visitMessageDateClause(CobolParser.MessageDateClauseContext ctx) {
        unsupported(ctx)
        //return super.visitMessageDateClause(ctx)
    }

    @Override
    Boolean visitMessageTimeClause(CobolParser.MessageTimeClauseContext ctx) {
        unsupported(ctx)
        //return super.visitMessageTimeClause(ctx)
    }

    @Override
    Boolean visitStatusKeyClause(CobolParser.StatusKeyClauseContext ctx) {
        unsupported(ctx)
        //return super.visitStatusKeyClause(ctx)
    }

    @Override
    Boolean visitSymbolicDestinationClause(CobolParser.SymbolicDestinationClauseContext ctx) {
        unsupported(ctx)
        //return super.visitSymbolicDestinationClause(ctx)
    }

    @Override
    Boolean visitSymbolicQueueClause(CobolParser.SymbolicQueueClauseContext ctx) {
        unsupported(ctx)
        //return super.visitSymbolicQueueClause(ctx)
    }

    @Override
    Boolean visitSymbolicSourceClause(CobolParser.SymbolicSourceClauseContext ctx) {
        unsupported(ctx)
        //return super.visitSymbolicSourceClause(ctx)
    }

    @Override
    Boolean visitSymbolicTerminalClause(CobolParser.SymbolicTerminalClauseContext ctx) {
        unsupported(ctx)
        //return super.visitSymbolicTerminalClause(ctx)
    }

    @Override
    Boolean visitSymbolicSubQueueClause(CobolParser.SymbolicSubQueueClauseContext ctx) {
        unsupported(ctx)
        //return super.visitSymbolicSubQueueClause(ctx)
    }

    @Override
    Boolean visitTextLengthClause(CobolParser.TextLengthClauseContext ctx) {
        unsupported(ctx)
        //return super.visitTextLengthClause(ctx)
    }

    @Override
    Boolean visitLocalStorageSection(CobolParser.LocalStorageSectionContext ctx) {
        unsupported(ctx)
        //return super.visitLocalStorageSection(ctx)
    }

    @Override
    Boolean visitScreenSection(CobolParser.ScreenSectionContext ctx) {
        unsupported(ctx)
        //return super.visitScreenSection(ctx)
    }

    @Override
    Boolean visitScreenDescriptionEntry(CobolParser.ScreenDescriptionEntryContext ctx) {
        unsupported(ctx)
        //return super.visitScreenDescriptionEntry(ctx)
    }

    @Override
    Boolean visitScreenDescriptionBlankClause(CobolParser.ScreenDescriptionBlankClauseContext ctx) {
        unsupported(ctx)
        //return super.visitScreenDescriptionBlankClause(ctx)
    }

    @Override
    Boolean visitScreenDescriptionBellClause(CobolParser.ScreenDescriptionBellClauseContext ctx) {
        unsupported(ctx)
        //return super.visitScreenDescriptionBellClause(ctx)
    }

    @Override
    Boolean visitScreenDescriptionBlinkClause(CobolParser.ScreenDescriptionBlinkClauseContext ctx) {
        unsupported(ctx)
        //return super.visitScreenDescriptionBlinkClause(ctx)
    }

    @Override
    Boolean visitScreenDescriptionEraseClause(CobolParser.ScreenDescriptionEraseClauseContext ctx) {
        unsupported(ctx)
        //return super.visitScreenDescriptionEraseClause(ctx)
    }

    @Override
    Boolean visitScreenDescriptionLightClause(CobolParser.ScreenDescriptionLightClauseContext ctx) {
        unsupported(ctx)
        //return super.visitScreenDescriptionLightClause(ctx)
    }

    @Override
    Boolean visitScreenDescriptionGridClause(CobolParser.ScreenDescriptionGridClauseContext ctx) {
        unsupported(ctx)
        //return super.visitScreenDescriptionGridClause(ctx)
    }

    @Override
    Boolean visitScreenDescriptionReverseVideoClause(CobolParser.ScreenDescriptionReverseVideoClauseContext ctx) {
        unsupported(ctx)
        //return super.visitScreenDescriptionReverseVideoClause(ctx)
    }

    @Override
    Boolean visitScreenDescriptionUnderlineClause(CobolParser.ScreenDescriptionUnderlineClauseContext ctx) {
        unsupported(ctx)
        //return super.visitScreenDescriptionUnderlineClause(ctx)
    }

    @Override
    Boolean visitScreenDescriptionSizeClause(CobolParser.ScreenDescriptionSizeClauseContext ctx) {
        unsupported(ctx)
        //return super.visitScreenDescriptionSizeClause(ctx)
    }

    @Override
    Boolean visitScreenDescriptionLineClause(CobolParser.ScreenDescriptionLineClauseContext ctx) {
        unsupported(ctx)
        //return super.visitScreenDescriptionLineClause(ctx)
    }

    @Override
    Boolean visitScreenDescriptionColumnClause(CobolParser.ScreenDescriptionColumnClauseContext ctx) {
        unsupported(ctx)
        //return super.visitScreenDescriptionColumnClause(ctx)
    }

    @Override
    Boolean visitScreenDescriptionForegroundColorClause(CobolParser.ScreenDescriptionForegroundColorClauseContext ctx) {
        unsupported(ctx)
        //return super.visitScreenDescriptionForegroundColorClause(ctx)
    }

    @Override
    Boolean visitScreenDescriptionBackgroundColorClause(CobolParser.ScreenDescriptionBackgroundColorClauseContext ctx) {
        unsupported(ctx)
        //return super.visitScreenDescriptionBackgroundColorClause(ctx)
    }

    @Override
    Boolean visitScreenDescriptionControlClause(CobolParser.ScreenDescriptionControlClauseContext ctx) {
        unsupported(ctx)
        //return super.visitScreenDescriptionControlClause(ctx)
    }

    @Override
    Boolean visitScreenDescriptionValueClause(CobolParser.ScreenDescriptionValueClauseContext ctx) {
        unsupported(ctx)
        //return super.visitScreenDescriptionValueClause(ctx)
    }

    @Override
    Boolean visitScreenDescriptionPictureClause(CobolParser.ScreenDescriptionPictureClauseContext ctx) {
        unsupported(ctx)
        //return super.visitScreenDescriptionPictureClause(ctx)
    }

    @Override
    Boolean visitScreenDescriptionFromClause(CobolParser.ScreenDescriptionFromClauseContext ctx) {
        unsupported(ctx)
        //return super.visitScreenDescriptionFromClause(ctx)
    }

    @Override
    Boolean visitScreenDescriptionToClause(CobolParser.ScreenDescriptionToClauseContext ctx) {
        unsupported(ctx)
        //return super.visitScreenDescriptionToClause(ctx)
    }

    @Override
    Boolean visitScreenDescriptionUsingClause(CobolParser.ScreenDescriptionUsingClauseContext ctx) {
        unsupported(ctx)
        //return super.visitScreenDescriptionUsingClause(ctx)
    }

    @Override
    Boolean visitScreenDescriptionUsageClause(CobolParser.ScreenDescriptionUsageClauseContext ctx) {
        unsupported(ctx)
        //return super.visitScreenDescriptionUsageClause(ctx)
    }

    @Override
    Boolean visitScreenDescriptionBlankWhenZeroClause(CobolParser.ScreenDescriptionBlankWhenZeroClauseContext ctx) {
        unsupported(ctx)
        //return super.visitScreenDescriptionBlankWhenZeroClause(ctx)
    }

    @Override
    Boolean visitScreenDescriptionJustifiedClause(CobolParser.ScreenDescriptionJustifiedClauseContext ctx) {
        unsupported(ctx)
        //return super.visitScreenDescriptionJustifiedClause(ctx)
    }

    @Override
    Boolean visitScreenDescriptionSignClause(CobolParser.ScreenDescriptionSignClauseContext ctx) {
        unsupported(ctx)
        //return super.visitScreenDescriptionSignClause(ctx)
    }

    @Override
    Boolean visitScreenDescriptionAutoClause(CobolParser.ScreenDescriptionAutoClauseContext ctx) {
        unsupported(ctx)
        //return super.visitScreenDescriptionAutoClause(ctx)
    }

    @Override
    Boolean visitScreenDescriptionSecureClause(CobolParser.ScreenDescriptionSecureClauseContext ctx) {
        unsupported(ctx)
        //return super.visitScreenDescriptionSecureClause(ctx)
    }

    @Override
    Boolean visitScreenDescriptionRequiredClause(CobolParser.ScreenDescriptionRequiredClauseContext ctx) {
        unsupported(ctx)
        //return super.visitScreenDescriptionRequiredClause(ctx)
    }

    @Override
    Boolean visitScreenDescriptionPromptClause(CobolParser.ScreenDescriptionPromptClauseContext ctx) {
        unsupported(ctx)
        //return super.visitScreenDescriptionPromptClause(ctx)
    }

    @Override
    Boolean visitScreenDescriptionPromptOccursClause(CobolParser.ScreenDescriptionPromptOccursClauseContext ctx) {
        unsupported(ctx)
        //return super.visitScreenDescriptionPromptOccursClause(ctx)
    }

    @Override
    Boolean visitScreenDescriptionFullClause(CobolParser.ScreenDescriptionFullClauseContext ctx) {
        unsupported(ctx)
        //return super.visitScreenDescriptionFullClause(ctx)
    }

    @Override
    Boolean visitScreenDescriptionZeroFillClause(CobolParser.ScreenDescriptionZeroFillClauseContext ctx) {
        unsupported(ctx)
        //return super.visitScreenDescriptionZeroFillClause(ctx)
    }

    @Override
    Boolean visitReportSection(CobolParser.ReportSectionContext ctx) {
        unsupported(ctx)
        //return super.visitReportSection(ctx)
    }

    @Override
    Boolean visitReportDescription(CobolParser.ReportDescriptionContext ctx) {
        unsupported(ctx)
        //return super.visitReportDescription(ctx)
    }

    @Override
    Boolean visitReportDescriptionEntry(CobolParser.ReportDescriptionEntryContext ctx) {
        unsupported(ctx)
        //return super.visitReportDescriptionEntry(ctx)
    }

    @Override
    Boolean visitReportDescriptionGlobalClause(CobolParser.ReportDescriptionGlobalClauseContext ctx) {
        unsupported(ctx)
        //return super.visitReportDescriptionGlobalClause(ctx)
    }

    @Override
    Boolean visitReportDescriptionPageLimitClause(CobolParser.ReportDescriptionPageLimitClauseContext ctx) {
        unsupported(ctx)
        //return super.visitReportDescriptionPageLimitClause(ctx)
    }

    @Override
    Boolean visitReportDescriptionHeadingClause(CobolParser.ReportDescriptionHeadingClauseContext ctx) {
        unsupported(ctx)
        //return super.visitReportDescriptionHeadingClause(ctx)
    }

    @Override
    Boolean visitReportDescriptionFirstDetailClause(CobolParser.ReportDescriptionFirstDetailClauseContext ctx) {
        unsupported(ctx)
        //return super.visitReportDescriptionFirstDetailClause(ctx)
    }

    @Override
    Boolean visitReportDescriptionLastDetailClause(CobolParser.ReportDescriptionLastDetailClauseContext ctx) {
        unsupported(ctx)
        //return super.visitReportDescriptionLastDetailClause(ctx)
    }

    @Override
    Boolean visitReportDescriptionFootingClause(CobolParser.ReportDescriptionFootingClauseContext ctx) {
        unsupported(ctx)
        //return super.visitReportDescriptionFootingClause(ctx)
    }

    @Override
    Boolean visitReportGroupDescriptionEntry(CobolParser.ReportGroupDescriptionEntryContext ctx) {
        unsupported(ctx)
        //return super.visitReportGroupDescriptionEntry(ctx)
    }

    @Override
    Boolean visitReportGroupDescriptionEntryFormat1(CobolParser.ReportGroupDescriptionEntryFormat1Context ctx) {
        unsupported(ctx)
        //return super.visitReportGroupDescriptionEntryFormat1(ctx)
    }

    @Override
    Boolean visitReportGroupDescriptionEntryFormat2(CobolParser.ReportGroupDescriptionEntryFormat2Context ctx) {
        unsupported(ctx)
        //return super.visitReportGroupDescriptionEntryFormat2(ctx)
    }

    @Override
    Boolean visitReportGroupDescriptionEntryFormat3(CobolParser.ReportGroupDescriptionEntryFormat3Context ctx) {
        unsupported(ctx)
        //return super.visitReportGroupDescriptionEntryFormat3(ctx)
    }

    @Override
    Boolean visitReportGroupBlankWhenZeroClause(CobolParser.ReportGroupBlankWhenZeroClauseContext ctx) {
        unsupported(ctx)
        //return super.visitReportGroupBlankWhenZeroClause(ctx)
    }

    @Override
    Boolean visitReportGroupColumnNumberClause(CobolParser.ReportGroupColumnNumberClauseContext ctx) {
        unsupported(ctx)
        //return super.visitReportGroupColumnNumberClause(ctx)
    }

    @Override
    Boolean visitReportGroupIndicateClause(CobolParser.ReportGroupIndicateClauseContext ctx) {
        unsupported(ctx)
        //return super.visitReportGroupIndicateClause(ctx)
    }

    @Override
    Boolean visitReportGroupJustifiedClause(CobolParser.ReportGroupJustifiedClauseContext ctx) {
        unsupported(ctx)
        //return super.visitReportGroupJustifiedClause(ctx)
    }

    @Override
    Boolean visitReportGroupLineNumberClause(CobolParser.ReportGroupLineNumberClauseContext ctx) {
        unsupported(ctx)
        //return super.visitReportGroupLineNumberClause(ctx)
    }

    @Override
    Boolean visitReportGroupLineNumberNextPage(CobolParser.ReportGroupLineNumberNextPageContext ctx) {
        unsupported(ctx)
        //return super.visitReportGroupLineNumberNextPage(ctx)
    }

    @Override
    Boolean visitReportGroupLineNumberPlus(CobolParser.ReportGroupLineNumberPlusContext ctx) {
        unsupported(ctx)
        //return super.visitReportGroupLineNumberPlus(ctx)
    }

    @Override
    Boolean visitReportGroupNextGroupClause(CobolParser.ReportGroupNextGroupClauseContext ctx) {
        unsupported(ctx)
        //return super.visitReportGroupNextGroupClause(ctx)
    }

    @Override
    Boolean visitReportGroupNextGroupPlus(CobolParser.ReportGroupNextGroupPlusContext ctx) {
        unsupported(ctx)
        //return super.visitReportGroupNextGroupPlus(ctx)
    }

    @Override
    Boolean visitReportGroupNextGroupNextPage(CobolParser.ReportGroupNextGroupNextPageContext ctx) {
        unsupported(ctx)
        //return super.visitReportGroupNextGroupNextPage(ctx)
    }

    @Override
    Boolean visitReportGroupPictureClause(CobolParser.ReportGroupPictureClauseContext ctx) {
        unsupported(ctx)
        //return super.visitReportGroupPictureClause(ctx)
    }

    @Override
    Boolean visitReportGroupResetClause(CobolParser.ReportGroupResetClauseContext ctx) {
        unsupported(ctx)
        //return super.visitReportGroupResetClause(ctx)
    }

    @Override
    Boolean visitReportGroupSignClause(CobolParser.ReportGroupSignClauseContext ctx) {
        unsupported(ctx)
        //return super.visitReportGroupSignClause(ctx)
    }

    @Override
    Boolean visitReportGroupSourceClause(CobolParser.ReportGroupSourceClauseContext ctx) {
        unsupported(ctx)
        //return super.visitReportGroupSourceClause(ctx)
    }

    @Override
    Boolean visitReportGroupSumClause(CobolParser.ReportGroupSumClauseContext ctx) {
        unsupported(ctx)
        //return super.visitReportGroupSumClause(ctx)
    }

    @Override
    Boolean visitReportGroupTypeClause(CobolParser.ReportGroupTypeClauseContext ctx) {
        unsupported(ctx)
        //return super.visitReportGroupTypeClause(ctx)
    }

    @Override
    Boolean visitReportGroupTypeReportHeading(CobolParser.ReportGroupTypeReportHeadingContext ctx) {
        unsupported(ctx)
        //return super.visitReportGroupTypeReportHeading(ctx)
    }

    @Override
    Boolean visitReportGroupTypePageHeading(CobolParser.ReportGroupTypePageHeadingContext ctx) {
        unsupported(ctx)
        //return super.visitReportGroupTypePageHeading(ctx)
    }

    @Override
    Boolean visitReportGroupTypeControlHeading(CobolParser.ReportGroupTypeControlHeadingContext ctx) {
        unsupported(ctx)
        //return super.visitReportGroupTypeControlHeading(ctx)
    }

    @Override
    Boolean visitReportGroupTypeDetail(CobolParser.ReportGroupTypeDetailContext ctx) {
        unsupported(ctx)
        //return super.visitReportGroupTypeDetail(ctx)
    }

    @Override
    Boolean visitReportGroupTypeControlFooting(CobolParser.ReportGroupTypeControlFootingContext ctx) {
        unsupported(ctx)
        //return super.visitReportGroupTypeControlFooting(ctx)
    }

    @Override
    Boolean visitReportGroupUsageClause(CobolParser.ReportGroupUsageClauseContext ctx) {
        unsupported(ctx)
        //return super.visitReportGroupUsageClause(ctx)
    }

    @Override
    Boolean visitReportGroupTypePageFooting(CobolParser.ReportGroupTypePageFootingContext ctx) {
        unsupported(ctx)
        //return super.visitReportGroupTypePageFooting(ctx)
    }

    @Override
    Boolean visitReportGroupTypeReportFooting(CobolParser.ReportGroupTypeReportFootingContext ctx) {
        unsupported(ctx)
        //return super.visitReportGroupTypeReportFooting(ctx)
    }

    @Override
    Boolean visitReportGroupValueClause(CobolParser.ReportGroupValueClauseContext ctx) {
        unsupported(ctx)
        //return super.visitReportGroupValueClause(ctx)
    }

    @Override
    Boolean visitProgramLibrarySection(CobolParser.ProgramLibrarySectionContext ctx) {
        unsupported(ctx)
        //return super.visitProgramLibrarySection(ctx)
    }

    @Override
    Boolean visitLibraryDescriptionEntry(CobolParser.LibraryDescriptionEntryContext ctx) {
        unsupported(ctx)
        //return super.visitLibraryDescriptionEntry(ctx)
    }

    @Override
    Boolean visitLibraryDescriptionEntryFormat1(CobolParser.LibraryDescriptionEntryFormat1Context ctx) {
        unsupported(ctx)
        //return super.visitLibraryDescriptionEntryFormat1(ctx)
    }

    @Override
    Boolean visitLibraryDescriptionEntryFormat2(CobolParser.LibraryDescriptionEntryFormat2Context ctx) {
        unsupported(ctx)
        //return super.visitLibraryDescriptionEntryFormat2(ctx)
    }

    @Override
    Boolean visitLibraryAttributeClauseFormat1(CobolParser.LibraryAttributeClauseFormat1Context ctx) {
        unsupported(ctx)
        //return super.visitLibraryAttributeClauseFormat1(ctx)
    }

    @Override
    Boolean visitLibraryAttributeClauseFormat2(CobolParser.LibraryAttributeClauseFormat2Context ctx) {
        unsupported(ctx)
        //return super.visitLibraryAttributeClauseFormat2(ctx)
    }

    @Override
    Boolean visitLibraryAttributeFunction(CobolParser.LibraryAttributeFunctionContext ctx) {
        unsupported(ctx)
        //return super.visitLibraryAttributeFunction(ctx)
    }

    @Override
    Boolean visitLibraryAttributeParameter(CobolParser.LibraryAttributeParameterContext ctx) {
        unsupported(ctx)
        //return super.visitLibraryAttributeParameter(ctx)
    }

    @Override
    Boolean visitLibraryAttributeTitle(CobolParser.LibraryAttributeTitleContext ctx) {
        unsupported(ctx)
        //return super.visitLibraryAttributeTitle(ctx)
    }

    @Override
    Boolean visitLibraryEntryProcedureClauseFormat1(CobolParser.LibraryEntryProcedureClauseFormat1Context ctx) {
        unsupported(ctx)
        //return super.visitLibraryEntryProcedureClauseFormat1(ctx)
    }

    @Override
    Boolean visitLibraryEntryProcedureClauseFormat2(CobolParser.LibraryEntryProcedureClauseFormat2Context ctx) {
        unsupported(ctx)
        //return super.visitLibraryEntryProcedureClauseFormat2(ctx)
    }

    @Override
    Boolean visitLibraryEntryProcedureForClause(CobolParser.LibraryEntryProcedureForClauseContext ctx) {
        unsupported(ctx)
        //return super.visitLibraryEntryProcedureForClause(ctx)
    }

    @Override
    Boolean visitLibraryEntryProcedureGivingClause(CobolParser.LibraryEntryProcedureGivingClauseContext ctx) {
        unsupported(ctx)
        //return super.visitLibraryEntryProcedureGivingClause(ctx)
    }

    @Override
    Boolean visitLibraryEntryProcedureUsingClause(CobolParser.LibraryEntryProcedureUsingClauseContext ctx) {
        unsupported(ctx)
        //return super.visitLibraryEntryProcedureUsingClause(ctx)
    }

    @Override
    Boolean visitLibraryEntryProcedureUsingName(CobolParser.LibraryEntryProcedureUsingNameContext ctx) {
        unsupported(ctx)
        //return super.visitLibraryEntryProcedureUsingName(ctx)
    }

    @Override
    Boolean visitLibraryEntryProcedureWithClause(CobolParser.LibraryEntryProcedureWithClauseContext ctx) {
        unsupported(ctx)
        //return super.visitLibraryEntryProcedureWithClause(ctx)
    }

    @Override
    Boolean visitLibraryEntryProcedureWithName(CobolParser.LibraryEntryProcedureWithNameContext ctx) {
        unsupported(ctx)
        //return super.visitLibraryEntryProcedureWithName(ctx)
    }

    @Override
    Boolean visitLibraryIsCommonClause(CobolParser.LibraryIsCommonClauseContext ctx) {
        unsupported(ctx)
        //return super.visitLibraryIsCommonClause(ctx)
    }

    @Override
    Boolean visitLibraryIsGlobalClause(CobolParser.LibraryIsGlobalClauseContext ctx) {
        unsupported(ctx)
        //return super.visitLibraryIsGlobalClause(ctx)
    }

    @Override
    Boolean visitDataDescriptionEntryFormat2(CobolParser.DataDescriptionEntryFormat2Context ctx) {
        unsupported(ctx)
        //return super.visitDataDescriptionEntryFormat2(ctx)
    }

    @Override
    Boolean visitDataDescriptionEntryExecSql(CobolParser.DataDescriptionEntryExecSqlContext ctx) {
        unsupported(ctx)
        //return super.visitDataDescriptionEntryExecSql(ctx)
    }

    @Override
    Boolean visitDataAlignedClause(CobolParser.DataAlignedClauseContext ctx) {
        unsupported(ctx)
        //return super.visitDataAlignedClause(ctx)
    }

    @Override
    Boolean visitDataBlankWhenZeroClause(CobolParser.DataBlankWhenZeroClauseContext ctx) {
        unsupported(ctx)
        //return super.visitDataBlankWhenZeroClause(ctx)
    }

    @Override
    Boolean visitDataCommonOwnLocalClause(CobolParser.DataCommonOwnLocalClauseContext ctx) {
        unsupported(ctx)
        //return super.visitDataCommonOwnLocalClause(ctx)
    }

    @Override
    Boolean visitDataExternalClause(CobolParser.DataExternalClauseContext ctx) {
        unsupported(ctx)
        //return super.visitDataExternalClause(ctx)
    }

    @Override
    Boolean visitDataGlobalClause(CobolParser.DataGlobalClauseContext ctx) {
        unsupported(ctx)
        //return super.visitDataGlobalClause(ctx)
    }

    @Override
    Boolean visitDataIntegerStringClause(CobolParser.DataIntegerStringClauseContext ctx) {
        unsupported(ctx)
        //return super.visitDataIntegerStringClause(ctx)
    }

    @Override
    Boolean visitDataJustifiedClause(CobolParser.DataJustifiedClauseContext ctx) {
        unsupported(ctx)
        //return super.visitDataJustifiedClause(ctx)
    }

    @Override
    Boolean visitDataOccursTo(CobolParser.DataOccursToContext ctx) {
        unsupported(ctx)
        //return super.visitDataOccursTo(ctx)
    }

    @Override
    Boolean visitDataOccursDepending(CobolParser.DataOccursDependingContext ctx) {
        unsupported(ctx)
        //return super.visitDataOccursDepending(ctx)
    }

    @Override
    Boolean visitDataOccursSort(CobolParser.DataOccursSortContext ctx) {
        unsupported(ctx)
        //return super.visitDataOccursSort(ctx)
    }

    @Override
    Boolean visitPictureCardinality(CobolParser.PictureCardinalityContext ctx) {
        unsupported(ctx)
        //return super.visitPictureCardinality(ctx)
    }

    @Override
    Boolean visitDataReceivedByClause(CobolParser.DataReceivedByClauseContext ctx) {
        unsupported(ctx)
        //return super.visitDataReceivedByClause(ctx)
    }

    @Override
    Boolean visitDataRecordAreaClause(CobolParser.DataRecordAreaClauseContext ctx) {
        unsupported(ctx)
        //return super.visitDataRecordAreaClause(ctx)
    }

    @Override
    Boolean visitDataRenamesClause(CobolParser.DataRenamesClauseContext ctx) {
        unsupported(ctx)
        //return super.visitDataRenamesClause(ctx)
    }

    @Override
    Boolean visitDataSignClause(CobolParser.DataSignClauseContext ctx) {
        unsupported(ctx)
        //return super.visitDataSignClause(ctx)
    }

    @Override
    Boolean visitDataSynchronizedClause(CobolParser.DataSynchronizedClauseContext ctx) {
        unsupported(ctx)
        //return super.visitDataSynchronizedClause(ctx)
    }

    @Override
    Boolean visitDataThreadLocalClause(CobolParser.DataThreadLocalClauseContext ctx) {
        unsupported(ctx)
        //return super.visitDataThreadLocalClause(ctx)
    }

    @Override
    Boolean visitDataTypeClause(CobolParser.DataTypeClauseContext ctx) {
        unsupported(ctx)
        //return super.visitDataTypeClause(ctx)
    }

    @Override
    Boolean visitDataTypeDefClause(CobolParser.DataTypeDefClauseContext ctx) {
        unsupported(ctx)
        //return super.visitDataTypeDefClause(ctx)
    }

    @Override
    Boolean visitDataUsingClause(CobolParser.DataUsingClauseContext ctx) {
        unsupported(ctx)
        //return super.visitDataUsingClause(ctx)
    }

    @Override
    Boolean visitDataValueIntervalTo(CobolParser.DataValueIntervalToContext ctx) {
        unsupported(ctx)
        //return super.visitDataValueIntervalTo(ctx)
    }

    @Override
    Boolean visitDataWithLowerBoundsClause(CobolParser.DataWithLowerBoundsClauseContext ctx) {
        unsupported(ctx)
        //return super.visitDataWithLowerBoundsClause(ctx)
    }

    @Override
    Boolean visitProcedureDivision(CobolParser.ProcedureDivisionContext ctx) {
        unsupported(ctx)
        //return super.visitProcedureDivision(ctx)
    }

    @Override
    Boolean visitProcedureDivisionUsingClause(CobolParser.ProcedureDivisionUsingClauseContext ctx) {
        unsupported(ctx)
        //return super.visitProcedureDivisionUsingClause(ctx)
    }

    @Override
    Boolean visitProcedureDivisionGivingClause(CobolParser.ProcedureDivisionGivingClauseContext ctx) {
        unsupported(ctx)
        //return super.visitProcedureDivisionGivingClause(ctx)
    }

    @Override
    Boolean visitProcedureDivisionUsingParameter(CobolParser.ProcedureDivisionUsingParameterContext ctx) {
        unsupported(ctx)
        //return super.visitProcedureDivisionUsingParameter(ctx)
    }

    @Override
    Boolean visitProcedureDivisionByReferencePhrase(CobolParser.ProcedureDivisionByReferencePhraseContext ctx) {
        unsupported(ctx)
        //return super.visitProcedureDivisionByReferencePhrase(ctx)
    }

    @Override
    Boolean visitProcedureDivisionByReference(CobolParser.ProcedureDivisionByReferenceContext ctx) {
        unsupported(ctx)
        //return super.visitProcedureDivisionByReference(ctx)
    }

    @Override
    Boolean visitProcedureDivisionByValuePhrase(CobolParser.ProcedureDivisionByValuePhraseContext ctx) {
        unsupported(ctx)
        //return super.visitProcedureDivisionByValuePhrase(ctx)
    }

    @Override
    Boolean visitProcedureDivisionByValue(CobolParser.ProcedureDivisionByValueContext ctx) {
        unsupported(ctx)
        //return super.visitProcedureDivisionByValue(ctx)
    }

    @Override
    Boolean visitProcedureDeclaratives(CobolParser.ProcedureDeclarativesContext ctx) {
        unsupported(ctx)
        //return super.visitProcedureDeclaratives(ctx)
    }

    @Override
    Boolean visitProcedureDeclarative(CobolParser.ProcedureDeclarativeContext ctx) {
        unsupported(ctx)
        //return super.visitProcedureDeclarative(ctx)
    }

    @Override
    Boolean visitProcedureSectionHeader(CobolParser.ProcedureSectionHeaderContext ctx) {
        unsupported(ctx)
        //return super.visitProcedureSectionHeader(ctx)
    }

    @Override
    Boolean visitProcedureDivisionBody(CobolParser.ProcedureDivisionBodyContext ctx) {
        unsupported(ctx)
        //return super.visitProcedureDivisionBody(ctx)
    }

    @Override
    Boolean visitProcedureSection(CobolParser.ProcedureSectionContext ctx) {
        unsupported(ctx)
        //return super.visitProcedureSection(ctx)
    }

    @Override
    Boolean visitParagraphs(CobolParser.ParagraphsContext ctx) {
        unsupported(ctx)
        //return super.visitParagraphs(ctx)
    }

    @Override
    Boolean visitParagraph(CobolParser.ParagraphContext ctx) {
        unsupported(ctx)
        //return super.visitParagraph(ctx)
    }

    @Override
    Boolean visitSentence(CobolParser.SentenceContext ctx) {
        unsupported(ctx)
        //return super.visitSentence(ctx)
    }

    @Override
    Boolean visitStatement(CobolParser.StatementContext ctx) {
        unsupported(ctx)
        //return super.visitStatement(ctx)
    }

    @Override
    Boolean visitAcceptStatement(CobolParser.AcceptStatementContext ctx) {
        unsupported(ctx)
        //return super.visitAcceptStatement(ctx)
    }

    @Override
    Boolean visitAcceptFromDateStatement(CobolParser.AcceptFromDateStatementContext ctx) {
        unsupported(ctx)
        //return super.visitAcceptFromDateStatement(ctx)
    }

    @Override
    Boolean visitAcceptFromMnemonicStatement(CobolParser.AcceptFromMnemonicStatementContext ctx) {
        unsupported(ctx)
        //return super.visitAcceptFromMnemonicStatement(ctx)
    }

    @Override
    Boolean visitAcceptFromEscapeKeyStatement(CobolParser.AcceptFromEscapeKeyStatementContext ctx) {
        unsupported(ctx)
        //return super.visitAcceptFromEscapeKeyStatement(ctx)
    }

    @Override
    Boolean visitAcceptMessageCountStatement(CobolParser.AcceptMessageCountStatementContext ctx) {
        unsupported(ctx)
        //return super.visitAcceptMessageCountStatement(ctx)
    }

    @Override
    Boolean visitAddStatement(CobolParser.AddStatementContext ctx) {
        unsupported(ctx)
        //return super.visitAddStatement(ctx)
    }

    @Override
    Boolean visitAddToStatement(CobolParser.AddToStatementContext ctx) {
        unsupported(ctx)
        //return super.visitAddToStatement(ctx)
    }

    @Override
    Boolean visitAddToGivingStatement(CobolParser.AddToGivingStatementContext ctx) {
        unsupported(ctx)
        //return super.visitAddToGivingStatement(ctx)
    }

    @Override
    Boolean visitAddCorrespondingStatement(CobolParser.AddCorrespondingStatementContext ctx) {
        unsupported(ctx)
        //return super.visitAddCorrespondingStatement(ctx)
    }

    @Override
    Boolean visitAddFrom(CobolParser.AddFromContext ctx) {
        unsupported(ctx)
        //return super.visitAddFrom(ctx)
    }

    @Override
    Boolean visitAddTo(CobolParser.AddToContext ctx) {
        unsupported(ctx)
        //return super.visitAddTo(ctx)
    }

    @Override
    Boolean visitAddToGiving(CobolParser.AddToGivingContext ctx) {
        unsupported(ctx)
        //return super.visitAddToGiving(ctx)
    }

    @Override
    Boolean visitAddGiving(CobolParser.AddGivingContext ctx) {
        unsupported(ctx)
        //return super.visitAddGiving(ctx)
    }

    @Override
    Boolean visitAlteredGoTo(CobolParser.AlteredGoToContext ctx) {
        unsupported(ctx)
        //return super.visitAlteredGoTo(ctx)
    }

    @Override
    Boolean visitAlterStatement(CobolParser.AlterStatementContext ctx) {
        unsupported(ctx)
        //return super.visitAlterStatement(ctx)
    }

    @Override
    Boolean visitAlterProceedTo(CobolParser.AlterProceedToContext ctx) {
        unsupported(ctx)
        //return super.visitAlterProceedTo(ctx)
    }

    @Override
    Boolean visitCallStatement(CobolParser.CallStatementContext ctx) {
        unsupported(ctx)
        //return super.visitCallStatement(ctx)
    }

    @Override
    Boolean visitCallUsingPhrase(CobolParser.CallUsingPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitCallUsingPhrase(ctx)
    }

    @Override
    Boolean visitCallUsingParameter(CobolParser.CallUsingParameterContext ctx) {
        unsupported(ctx)
        //return super.visitCallUsingParameter(ctx)
    }

    @Override
    Boolean visitCallByReferencePhrase(CobolParser.CallByReferencePhraseContext ctx) {
        unsupported(ctx)
        //return super.visitCallByReferencePhrase(ctx)
    }

    @Override
    Boolean visitCallByReference(CobolParser.CallByReferenceContext ctx) {
        unsupported(ctx)
        //return super.visitCallByReference(ctx)
    }

    @Override
    Boolean visitCallByValuePhrase(CobolParser.CallByValuePhraseContext ctx) {
        unsupported(ctx)
        //return super.visitCallByValuePhrase(ctx)
    }

    @Override
    Boolean visitCallByValue(CobolParser.CallByValueContext ctx) {
        unsupported(ctx)
        //return super.visitCallByValue(ctx)
    }

    @Override
    Boolean visitCallByContentPhrase(CobolParser.CallByContentPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitCallByContentPhrase(ctx)
    }

    @Override
    Boolean visitCallByContent(CobolParser.CallByContentContext ctx) {
        unsupported(ctx)
        //return super.visitCallByContent(ctx)
    }

    @Override
    Boolean visitCallGivingPhrase(CobolParser.CallGivingPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitCallGivingPhrase(ctx)
    }

    @Override
    Boolean visitCancelStatement(CobolParser.CancelStatementContext ctx) {
        unsupported(ctx)
        //return super.visitCancelStatement(ctx)
    }

    @Override
    Boolean visitCancelCall(CobolParser.CancelCallContext ctx) {
        unsupported(ctx)
        //return super.visitCancelCall(ctx)
    }

    @Override
    Boolean visitCloseStatement(CobolParser.CloseStatementContext ctx) {
        unsupported(ctx)
        //return super.visitCloseStatement(ctx)
    }

    @Override
    Boolean visitCloseFile(CobolParser.CloseFileContext ctx) {
        unsupported(ctx)
        //return super.visitCloseFile(ctx)
    }

    @Override
    Boolean visitCloseReelUnitStatement(CobolParser.CloseReelUnitStatementContext ctx) {
        unsupported(ctx)
        //return super.visitCloseReelUnitStatement(ctx)
    }

    @Override
    Boolean visitCloseRelativeStatement(CobolParser.CloseRelativeStatementContext ctx) {
        unsupported(ctx)
        //return super.visitCloseRelativeStatement(ctx)
    }

    @Override
    Boolean visitClosePortFileIOStatement(CobolParser.ClosePortFileIOStatementContext ctx) {
        unsupported(ctx)
        //return super.visitClosePortFileIOStatement(ctx)
    }

    @Override
    Boolean visitClosePortFileIOUsing(CobolParser.ClosePortFileIOUsingContext ctx) {
        unsupported(ctx)
        //return super.visitClosePortFileIOUsing(ctx)
    }

    @Override
    Boolean visitClosePortFileIOUsingCloseDisposition(CobolParser.ClosePortFileIOUsingCloseDispositionContext ctx) {
        unsupported(ctx)
        //return super.visitClosePortFileIOUsingCloseDisposition(ctx)
    }

    @Override
    Boolean visitClosePortFileIOUsingAssociatedData(CobolParser.ClosePortFileIOUsingAssociatedDataContext ctx) {
        unsupported(ctx)
        //return super.visitClosePortFileIOUsingAssociatedData(ctx)
    }

    @Override
    Boolean visitClosePortFileIOUsingAssociatedDataLength(CobolParser.ClosePortFileIOUsingAssociatedDataLengthContext ctx) {
        unsupported(ctx)
        //return super.visitClosePortFileIOUsingAssociatedDataLength(ctx)
    }

    @Override
    Boolean visitComputeStatement(CobolParser.ComputeStatementContext ctx) {
        unsupported(ctx)
        //return super.visitComputeStatement(ctx)
    }

    @Override
    Boolean visitComputeStore(CobolParser.ComputeStoreContext ctx) {
        unsupported(ctx)
        //return super.visitComputeStore(ctx)
    }

    @Override
    Boolean visitContinueStatement(CobolParser.ContinueStatementContext ctx) {
        unsupported(ctx)
        //return super.visitContinueStatement(ctx)
    }

    @Override
    Boolean visitDeleteStatement(CobolParser.DeleteStatementContext ctx) {
        unsupported(ctx)
        //return super.visitDeleteStatement(ctx)
    }

    @Override
    Boolean visitDisableStatement(CobolParser.DisableStatementContext ctx) {
        unsupported(ctx)
        //return super.visitDisableStatement(ctx)
    }

    @Override
    Boolean visitDisplayStatement(CobolParser.DisplayStatementContext ctx) {
        unsupported(ctx)
        //return super.visitDisplayStatement(ctx)
    }

    @Override
    Boolean visitDisplayOperand(CobolParser.DisplayOperandContext ctx) {
        unsupported(ctx)
        //return super.visitDisplayOperand(ctx)
    }

    @Override
    Boolean visitDisplayAt(CobolParser.DisplayAtContext ctx) {
        unsupported(ctx)
        //return super.visitDisplayAt(ctx)
    }

    @Override
    Boolean visitDisplayUpon(CobolParser.DisplayUponContext ctx) {
        unsupported(ctx)
        //return super.visitDisplayUpon(ctx)
    }

    @Override
    Boolean visitDisplayWith(CobolParser.DisplayWithContext ctx) {
        unsupported(ctx)
        //return super.visitDisplayWith(ctx)
    }

    @Override
    Boolean visitDivideStatement(CobolParser.DivideStatementContext ctx) {
        unsupported(ctx)
        //return super.visitDivideStatement(ctx)
    }

    @Override
    Boolean visitDivideIntoStatement(CobolParser.DivideIntoStatementContext ctx) {
        unsupported(ctx)
        //return super.visitDivideIntoStatement(ctx)
    }

    @Override
    Boolean visitDivideIntoGivingStatement(CobolParser.DivideIntoGivingStatementContext ctx) {
        unsupported(ctx)
        //return super.visitDivideIntoGivingStatement(ctx)
    }

    @Override
    Boolean visitDivideByGivingStatement(CobolParser.DivideByGivingStatementContext ctx) {
        unsupported(ctx)
        //return super.visitDivideByGivingStatement(ctx)
    }

    @Override
    Boolean visitDivideGivingPhrase(CobolParser.DivideGivingPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitDivideGivingPhrase(ctx)
    }

    @Override
    Boolean visitDivideInto(CobolParser.DivideIntoContext ctx) {
        unsupported(ctx)
        //return super.visitDivideInto(ctx)
    }

    @Override
    Boolean visitDivideGiving(CobolParser.DivideGivingContext ctx) {
        unsupported(ctx)
        //return super.visitDivideGiving(ctx)
    }

    @Override
    Boolean visitDivideRemainder(CobolParser.DivideRemainderContext ctx) {
        unsupported(ctx)
        //return super.visitDivideRemainder(ctx)
    }

    @Override
    Boolean visitEnableStatement(CobolParser.EnableStatementContext ctx) {
        unsupported(ctx)
        //return super.visitEnableStatement(ctx)
    }

    @Override
    Boolean visitEntryStatement(CobolParser.EntryStatementContext ctx) {
        unsupported(ctx)
        //return super.visitEntryStatement(ctx)
    }

    @Override
    Boolean visitEvaluateStatement(CobolParser.EvaluateStatementContext ctx) {
        unsupported(ctx)
        //return super.visitEvaluateStatement(ctx)
    }

    @Override
    Boolean visitEvaluateSelect(CobolParser.EvaluateSelectContext ctx) {
        unsupported(ctx)
        //return super.visitEvaluateSelect(ctx)
    }

    @Override
    Boolean visitEvaluateAlsoSelect(CobolParser.EvaluateAlsoSelectContext ctx) {
        unsupported(ctx)
        //return super.visitEvaluateAlsoSelect(ctx)
    }

    @Override
    Boolean visitEvaluateWhenPhrase(CobolParser.EvaluateWhenPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitEvaluateWhenPhrase(ctx)
    }

    @Override
    Boolean visitEvaluateWhen(CobolParser.EvaluateWhenContext ctx) {
        unsupported(ctx)
        //return super.visitEvaluateWhen(ctx)
    }

    @Override
    Boolean visitEvaluateCondition(CobolParser.EvaluateConditionContext ctx) {
        unsupported(ctx)
        //return super.visitEvaluateCondition(ctx)
    }

    @Override
    Boolean visitEvaluateThrough(CobolParser.EvaluateThroughContext ctx) {
        unsupported(ctx)
        //return super.visitEvaluateThrough(ctx)
    }

    @Override
    Boolean visitEvaluateAlsoCondition(CobolParser.EvaluateAlsoConditionContext ctx) {
        unsupported(ctx)
        //return super.visitEvaluateAlsoCondition(ctx)
    }

    @Override
    Boolean visitEvaluateWhenOther(CobolParser.EvaluateWhenOtherContext ctx) {
        unsupported(ctx)
        //return super.visitEvaluateWhenOther(ctx)
    }

    @Override
    Boolean visitEvaluateValue(CobolParser.EvaluateValueContext ctx) {
        unsupported(ctx)
        //return super.visitEvaluateValue(ctx)
    }

    @Override
    Boolean visitExecCicsStatement(CobolParser.ExecCicsStatementContext ctx) {
        unsupported(ctx)
        //return super.visitExecCicsStatement(ctx)
    }

    @Override
    Boolean visitExecSqlStatement(CobolParser.ExecSqlStatementContext ctx) {
        unsupported(ctx)
        //return super.visitExecSqlStatement(ctx)
    }

    @Override
    Boolean visitExecSqlImsStatement(CobolParser.ExecSqlImsStatementContext ctx) {
        unsupported(ctx)
        //return super.visitExecSqlImsStatement(ctx)
    }

    @Override
    Boolean visitExhibitStatement(CobolParser.ExhibitStatementContext ctx) {
        unsupported(ctx)
        //return super.visitExhibitStatement(ctx)
    }

    @Override
    Boolean visitExhibitOperand(CobolParser.ExhibitOperandContext ctx) {
        unsupported(ctx)
        //return super.visitExhibitOperand(ctx)
    }

    @Override
    Boolean visitExitStatement(CobolParser.ExitStatementContext ctx) {
        unsupported(ctx)
        //return super.visitExitStatement(ctx)
    }

    @Override
    Boolean visitGenerateStatement(CobolParser.GenerateStatementContext ctx) {
        unsupported(ctx)
        //return super.visitGenerateStatement(ctx)
    }

    @Override
    Boolean visitGobackStatement(CobolParser.GobackStatementContext ctx) {
        unsupported(ctx)
        //return super.visitGobackStatement(ctx)
    }

    @Override
    Boolean visitGoToStatement(CobolParser.GoToStatementContext ctx) {
        unsupported(ctx)
        //return super.visitGoToStatement(ctx)
    }

    @Override
    Boolean visitGoToStatementSimple(CobolParser.GoToStatementSimpleContext ctx) {
        unsupported(ctx)
        //return super.visitGoToStatementSimple(ctx)
    }

    @Override
    Boolean visitGoToDependingOnStatement(CobolParser.GoToDependingOnStatementContext ctx) {
        unsupported(ctx)
        //return super.visitGoToDependingOnStatement(ctx)
    }

    @Override
    Boolean visitIfStatement(CobolParser.IfStatementContext ctx) {
        unsupported(ctx)
        //return super.visitIfStatement(ctx)
    }

    @Override
    Boolean visitIfThen(CobolParser.IfThenContext ctx) {
        unsupported(ctx)
        //return super.visitIfThen(ctx)
    }

    @Override
    Boolean visitIfElse(CobolParser.IfElseContext ctx) {
        unsupported(ctx)
        //return super.visitIfElse(ctx)
    }

    @Override
    Boolean visitInitializeStatement(CobolParser.InitializeStatementContext ctx) {
        unsupported(ctx)
        //return super.visitInitializeStatement(ctx)
    }

    @Override
    Boolean visitInitializeReplacingPhrase(CobolParser.InitializeReplacingPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitInitializeReplacingPhrase(ctx)
    }

    @Override
    Boolean visitInitializeReplacingBy(CobolParser.InitializeReplacingByContext ctx) {
        unsupported(ctx)
        //return super.visitInitializeReplacingBy(ctx)
    }

    @Override
    Boolean visitInitiateStatement(CobolParser.InitiateStatementContext ctx) {
        unsupported(ctx)
        //return super.visitInitiateStatement(ctx)
    }

    @Override
    Boolean visitInspectStatement(CobolParser.InspectStatementContext ctx) {
        unsupported(ctx)
        //return super.visitInspectStatement(ctx)
    }

    @Override
    Boolean visitInspectTallyingPhrase(CobolParser.InspectTallyingPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitInspectTallyingPhrase(ctx)
    }

    @Override
    Boolean visitInspectReplacingPhrase(CobolParser.InspectReplacingPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitInspectReplacingPhrase(ctx)
    }

    @Override
    Boolean visitInspectTallyingReplacingPhrase(CobolParser.InspectTallyingReplacingPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitInspectTallyingReplacingPhrase(ctx)
    }

    @Override
    Boolean visitInspectConvertingPhrase(CobolParser.InspectConvertingPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitInspectConvertingPhrase(ctx)
    }

    @Override
    Boolean visitInspectFor(CobolParser.InspectForContext ctx) {
        unsupported(ctx)
        //return super.visitInspectFor(ctx)
    }

    @Override
    Boolean visitInspectCharacters(CobolParser.InspectCharactersContext ctx) {
        unsupported(ctx)
        //return super.visitInspectCharacters(ctx)
    }

    @Override
    Boolean visitInspectReplacingCharacters(CobolParser.InspectReplacingCharactersContext ctx) {
        unsupported(ctx)
        //return super.visitInspectReplacingCharacters(ctx)
    }

    @Override
    Boolean visitInspectAllLeadings(CobolParser.InspectAllLeadingsContext ctx) {
        unsupported(ctx)
        //return super.visitInspectAllLeadings(ctx)
    }

    @Override
    Boolean visitInspectReplacingAllLeadings(CobolParser.InspectReplacingAllLeadingsContext ctx) {
        unsupported(ctx)
        //return super.visitInspectReplacingAllLeadings(ctx)
    }

    @Override
    Boolean visitInspectAllLeading(CobolParser.InspectAllLeadingContext ctx) {
        unsupported(ctx)
        //return super.visitInspectAllLeading(ctx)
    }

    @Override
    Boolean visitInspectReplacingAllLeading(CobolParser.InspectReplacingAllLeadingContext ctx) {
        unsupported(ctx)
        //return super.visitInspectReplacingAllLeading(ctx)
    }

    @Override
    Boolean visitInspectBy(CobolParser.InspectByContext ctx) {
        unsupported(ctx)
        //return super.visitInspectBy(ctx)
    }

    @Override
    Boolean visitInspectTo(CobolParser.InspectToContext ctx) {
        unsupported(ctx)
        //return super.visitInspectTo(ctx)
    }

    @Override
    Boolean visitInspectBeforeAfter(CobolParser.InspectBeforeAfterContext ctx) {
        unsupported(ctx)
        //return super.visitInspectBeforeAfter(ctx)
    }

    @Override
    Boolean visitMergeStatement(CobolParser.MergeStatementContext ctx) {
        unsupported(ctx)
        //return super.visitMergeStatement(ctx)
    }

    @Override
    Boolean visitMergeOnKeyClause(CobolParser.MergeOnKeyClauseContext ctx) {
        unsupported(ctx)
        //return super.visitMergeOnKeyClause(ctx)
    }

    @Override
    Boolean visitMergeCollatingSequencePhrase(CobolParser.MergeCollatingSequencePhraseContext ctx) {
        unsupported(ctx)
        //return super.visitMergeCollatingSequencePhrase(ctx)
    }

    @Override
    Boolean visitMergeCollatingAlphanumeric(CobolParser.MergeCollatingAlphanumericContext ctx) {
        unsupported(ctx)
        //return super.visitMergeCollatingAlphanumeric(ctx)
    }

    @Override
    Boolean visitMergeCollatingNational(CobolParser.MergeCollatingNationalContext ctx) {
        unsupported(ctx)
        //return super.visitMergeCollatingNational(ctx)
    }

    @Override
    Boolean visitMergeUsing(CobolParser.MergeUsingContext ctx) {
        unsupported(ctx)
        //return super.visitMergeUsing(ctx)
    }

    @Override
    Boolean visitMergeOutputProcedurePhrase(CobolParser.MergeOutputProcedurePhraseContext ctx) {
        unsupported(ctx)
        //return super.visitMergeOutputProcedurePhrase(ctx)
    }

    @Override
    Boolean visitMergeOutputThrough(CobolParser.MergeOutputThroughContext ctx) {
        unsupported(ctx)
        //return super.visitMergeOutputThrough(ctx)
    }

    @Override
    Boolean visitMergeGivingPhrase(CobolParser.MergeGivingPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitMergeGivingPhrase(ctx)
    }

    @Override
    Boolean visitMergeGiving(CobolParser.MergeGivingContext ctx) {
        unsupported(ctx)
        //return super.visitMergeGiving(ctx)
    }

    @Override
    Boolean visitMoveStatement(CobolParser.MoveStatementContext ctx) {
        unsupported(ctx)
        //return super.visitMoveStatement(ctx)
    }

    @Override
    Boolean visitMoveToStatement(CobolParser.MoveToStatementContext ctx) {
        unsupported(ctx)
        //return super.visitMoveToStatement(ctx)
    }

    @Override
    Boolean visitMoveToSendingArea(CobolParser.MoveToSendingAreaContext ctx) {
        unsupported(ctx)
        //return super.visitMoveToSendingArea(ctx)
    }

    @Override
    Boolean visitMoveCorrespondingToStatement(CobolParser.MoveCorrespondingToStatementContext ctx) {
        unsupported(ctx)
        //return super.visitMoveCorrespondingToStatement(ctx)
    }

    @Override
    Boolean visitMoveCorrespondingToSendingArea(CobolParser.MoveCorrespondingToSendingAreaContext ctx) {
        unsupported(ctx)
        //return super.visitMoveCorrespondingToSendingArea(ctx)
    }

    @Override
    Boolean visitMultiplyStatement(CobolParser.MultiplyStatementContext ctx) {
        unsupported(ctx)
        //return super.visitMultiplyStatement(ctx)
    }

    @Override
    Boolean visitMultiplyRegular(CobolParser.MultiplyRegularContext ctx) {
        unsupported(ctx)
        //return super.visitMultiplyRegular(ctx)
    }

    @Override
    Boolean visitMultiplyRegularOperand(CobolParser.MultiplyRegularOperandContext ctx) {
        unsupported(ctx)
        //return super.visitMultiplyRegularOperand(ctx)
    }

    @Override
    Boolean visitMultiplyGiving(CobolParser.MultiplyGivingContext ctx) {
        unsupported(ctx)
        //return super.visitMultiplyGiving(ctx)
    }

    @Override
    Boolean visitMultiplyGivingOperand(CobolParser.MultiplyGivingOperandContext ctx) {
        unsupported(ctx)
        //return super.visitMultiplyGivingOperand(ctx)
    }

    @Override
    Boolean visitMultiplyGivingResult(CobolParser.MultiplyGivingResultContext ctx) {
        unsupported(ctx)
        //return super.visitMultiplyGivingResult(ctx)
    }

    @Override
    Boolean visitNextSentenceStatement(CobolParser.NextSentenceStatementContext ctx) {
        unsupported(ctx)
        //return super.visitNextSentenceStatement(ctx)
    }

    @Override
    Boolean visitOpenStatement(CobolParser.OpenStatementContext ctx) {
        unsupported(ctx)
        //return super.visitOpenStatement(ctx)
    }

    @Override
    Boolean visitOpenInputStatement(CobolParser.OpenInputStatementContext ctx) {
        unsupported(ctx)
        //return super.visitOpenInputStatement(ctx)
    }

    @Override
    Boolean visitOpenInput(CobolParser.OpenInputContext ctx) {
        unsupported(ctx)
        //return super.visitOpenInput(ctx)
    }

    @Override
    Boolean visitOpenOutputStatement(CobolParser.OpenOutputStatementContext ctx) {
        unsupported(ctx)
        //return super.visitOpenOutputStatement(ctx)
    }

    @Override
    Boolean visitOpenOutput(CobolParser.OpenOutputContext ctx) {
        unsupported(ctx)
        //return super.visitOpenOutput(ctx)
    }

    @Override
    Boolean visitOpenIOStatement(CobolParser.OpenIOStatementContext ctx) {
        unsupported(ctx)
        //return super.visitOpenIOStatement(ctx)
    }

    @Override
    Boolean visitOpenExtendStatement(CobolParser.OpenExtendStatementContext ctx) {
        unsupported(ctx)
        //return super.visitOpenExtendStatement(ctx)
    }

    @Override
    Boolean visitPerformStatement(CobolParser.PerformStatementContext ctx) {
        unsupported(ctx)
        //return super.visitPerformStatement(ctx)
    }

    @Override
    Boolean visitPerformInlineStatement(CobolParser.PerformInlineStatementContext ctx) {
        unsupported(ctx)
        //return super.visitPerformInlineStatement(ctx)
    }

    @Override
    Boolean visitPerformProcedureStatement(CobolParser.PerformProcedureStatementContext ctx) {
        unsupported(ctx)
        //return super.visitPerformProcedureStatement(ctx)
    }

    @Override
    Boolean visitPerformType(CobolParser.PerformTypeContext ctx) {
        unsupported(ctx)
        //return super.visitPerformType(ctx)
    }

    @Override
    Boolean visitPerformTimes(CobolParser.PerformTimesContext ctx) {
        unsupported(ctx)
        //return super.visitPerformTimes(ctx)
    }

    @Override
    Boolean visitPerformUntil(CobolParser.PerformUntilContext ctx) {
        unsupported(ctx)
        //return super.visitPerformUntil(ctx)
    }

    @Override
    Boolean visitPerformVarying(CobolParser.PerformVaryingContext ctx) {
        unsupported(ctx)
        //return super.visitPerformVarying(ctx)
    }

    @Override
    Boolean visitPerformVaryingClause(CobolParser.PerformVaryingClauseContext ctx) {
        unsupported(ctx)
        //return super.visitPerformVaryingClause(ctx)
    }

    @Override
    Boolean visitPerformVaryingPhrase(CobolParser.PerformVaryingPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitPerformVaryingPhrase(ctx)
    }

    @Override
    Boolean visitPerformAfter(CobolParser.PerformAfterContext ctx) {
        unsupported(ctx)
        //return super.visitPerformAfter(ctx)
    }

    @Override
    Boolean visitPerformFrom(CobolParser.PerformFromContext ctx) {
        unsupported(ctx)
        //return super.visitPerformFrom(ctx)
    }

    @Override
    Boolean visitPerformBy(CobolParser.PerformByContext ctx) {
        unsupported(ctx)
        //return super.visitPerformBy(ctx)
    }

    @Override
    Boolean visitPerformTestClause(CobolParser.PerformTestClauseContext ctx) {
        unsupported(ctx)
        //return super.visitPerformTestClause(ctx)
    }

    @Override
    Boolean visitPurgeStatement(CobolParser.PurgeStatementContext ctx) {
        unsupported(ctx)
        //return super.visitPurgeStatement(ctx)
    }

    @Override
    Boolean visitReadStatement(CobolParser.ReadStatementContext ctx) {
        unsupported(ctx)
        //return super.visitReadStatement(ctx)
    }

    @Override
    Boolean visitReadInto(CobolParser.ReadIntoContext ctx) {
        unsupported(ctx)
        //return super.visitReadInto(ctx)
    }

    @Override
    Boolean visitReadWith(CobolParser.ReadWithContext ctx) {
        unsupported(ctx)
        //return super.visitReadWith(ctx)
    }

    @Override
    Boolean visitReadKey(CobolParser.ReadKeyContext ctx) {
        unsupported(ctx)
        //return super.visitReadKey(ctx)
    }

    @Override
    Boolean visitReceiveStatement(CobolParser.ReceiveStatementContext ctx) {
        unsupported(ctx)
        //return super.visitReceiveStatement(ctx)
    }

    @Override
    Boolean visitReceiveFromStatement(CobolParser.ReceiveFromStatementContext ctx) {
        unsupported(ctx)
        //return super.visitReceiveFromStatement(ctx)
    }

    @Override
    Boolean visitReceiveFrom(CobolParser.ReceiveFromContext ctx) {
        unsupported(ctx)
        //return super.visitReceiveFrom(ctx)
    }

    @Override
    Boolean visitReceiveIntoStatement(CobolParser.ReceiveIntoStatementContext ctx) {
        unsupported(ctx)
        //return super.visitReceiveIntoStatement(ctx)
    }

    @Override
    Boolean visitReceiveNoData(CobolParser.ReceiveNoDataContext ctx) {
        unsupported(ctx)
        //return super.visitReceiveNoData(ctx)
    }

    @Override
    Boolean visitReceiveWithData(CobolParser.ReceiveWithDataContext ctx) {
        unsupported(ctx)
        //return super.visitReceiveWithData(ctx)
    }

    @Override
    Boolean visitReceiveBefore(CobolParser.ReceiveBeforeContext ctx) {
        unsupported(ctx)
        //return super.visitReceiveBefore(ctx)
    }

    @Override
    Boolean visitReceiveWith(CobolParser.ReceiveWithContext ctx) {
        unsupported(ctx)
        //return super.visitReceiveWith(ctx)
    }

    @Override
    Boolean visitReceiveThread(CobolParser.ReceiveThreadContext ctx) {
        unsupported(ctx)
        //return super.visitReceiveThread(ctx)
    }

    @Override
    Boolean visitReceiveSize(CobolParser.ReceiveSizeContext ctx) {
        unsupported(ctx)
        //return super.visitReceiveSize(ctx)
    }

    @Override
    Boolean visitReceiveStatus(CobolParser.ReceiveStatusContext ctx) {
        unsupported(ctx)
        //return super.visitReceiveStatus(ctx)
    }

    @Override
    Boolean visitReleaseStatement(CobolParser.ReleaseStatementContext ctx) {
        unsupported(ctx)
        //return super.visitReleaseStatement(ctx)
    }

    @Override
    Boolean visitReturnStatement(CobolParser.ReturnStatementContext ctx) {
        unsupported(ctx)
        //return super.visitReturnStatement(ctx)
    }

    @Override
    Boolean visitReturnInto(CobolParser.ReturnIntoContext ctx) {
        unsupported(ctx)
        //return super.visitReturnInto(ctx)
    }

    @Override
    Boolean visitRewriteStatement(CobolParser.RewriteStatementContext ctx) {
        unsupported(ctx)
        //return super.visitRewriteStatement(ctx)
    }

    @Override
    Boolean visitRewriteFrom(CobolParser.RewriteFromContext ctx) {
        unsupported(ctx)
        //return super.visitRewriteFrom(ctx)
    }

    @Override
    Boolean visitSearchStatement(CobolParser.SearchStatementContext ctx) {
        unsupported(ctx)
        //return super.visitSearchStatement(ctx)
    }

    @Override
    Boolean visitSearchVarying(CobolParser.SearchVaryingContext ctx) {
        unsupported(ctx)
        //return super.visitSearchVarying(ctx)
    }

    @Override
    Boolean visitSearchWhen(CobolParser.SearchWhenContext ctx) {
        unsupported(ctx)
        //return super.visitSearchWhen(ctx)
    }

    @Override
    Boolean visitSendStatement(CobolParser.SendStatementContext ctx) {
        unsupported(ctx)
        //return super.visitSendStatement(ctx)
    }

    @Override
    Boolean visitSendStatementSync(CobolParser.SendStatementSyncContext ctx) {
        unsupported(ctx)
        //return super.visitSendStatementSync(ctx)
    }

    @Override
    Boolean visitSendStatementAsync(CobolParser.SendStatementAsyncContext ctx) {
        unsupported(ctx)
        //return super.visitSendStatementAsync(ctx)
    }

    @Override
    Boolean visitSendFromPhrase(CobolParser.SendFromPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitSendFromPhrase(ctx)
    }

    @Override
    Boolean visitSendWithPhrase(CobolParser.SendWithPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitSendWithPhrase(ctx)
    }

    @Override
    Boolean visitSendReplacingPhrase(CobolParser.SendReplacingPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitSendReplacingPhrase(ctx)
    }

    @Override
    Boolean visitSendAdvancingPhrase(CobolParser.SendAdvancingPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitSendAdvancingPhrase(ctx)
    }

    @Override
    Boolean visitSendAdvancingPage(CobolParser.SendAdvancingPageContext ctx) {
        unsupported(ctx)
        //return super.visitSendAdvancingPage(ctx)
    }

    @Override
    Boolean visitSendAdvancingLines(CobolParser.SendAdvancingLinesContext ctx) {
        unsupported(ctx)
        //return super.visitSendAdvancingLines(ctx)
    }

    @Override
    Boolean visitSendAdvancingMnemonic(CobolParser.SendAdvancingMnemonicContext ctx) {
        unsupported(ctx)
        //return super.visitSendAdvancingMnemonic(ctx)
    }

    @Override
    Boolean visitSetStatement(CobolParser.SetStatementContext ctx) {
        unsupported(ctx)
        //return super.visitSetStatement(ctx)
    }

    @Override
    Boolean visitSetToStatement(CobolParser.SetToStatementContext ctx) {
        unsupported(ctx)
        //return super.visitSetToStatement(ctx)
    }

    @Override
    Boolean visitSetUpDownByStatement(CobolParser.SetUpDownByStatementContext ctx) {
        unsupported(ctx)
        //return super.visitSetUpDownByStatement(ctx)
    }

    @Override
    Boolean visitSetTo(CobolParser.SetToContext ctx) {
        unsupported(ctx)
        //return super.visitSetTo(ctx)
    }

    @Override
    Boolean visitSetToValue(CobolParser.SetToValueContext ctx) {
        unsupported(ctx)
        //return super.visitSetToValue(ctx)
    }

    @Override
    Boolean visitSetByValue(CobolParser.SetByValueContext ctx) {
        unsupported(ctx)
        //return super.visitSetByValue(ctx)
    }

    @Override
    Boolean visitSortStatement(CobolParser.SortStatementContext ctx) {
        unsupported(ctx)
        //return super.visitSortStatement(ctx)
    }

    @Override
    Boolean visitSortOnKeyClause(CobolParser.SortOnKeyClauseContext ctx) {
        unsupported(ctx)
        //return super.visitSortOnKeyClause(ctx)
    }

    @Override
    Boolean visitSortDuplicatesPhrase(CobolParser.SortDuplicatesPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitSortDuplicatesPhrase(ctx)
    }

    @Override
    Boolean visitSortCollatingSequencePhrase(CobolParser.SortCollatingSequencePhraseContext ctx) {
        unsupported(ctx)
        //return super.visitSortCollatingSequencePhrase(ctx)
    }

    @Override
    Boolean visitSortCollatingAlphanumeric(CobolParser.SortCollatingAlphanumericContext ctx) {
        unsupported(ctx)
        //return super.visitSortCollatingAlphanumeric(ctx)
    }

    @Override
    Boolean visitSortCollatingNational(CobolParser.SortCollatingNationalContext ctx) {
        unsupported(ctx)
        //return super.visitSortCollatingNational(ctx)
    }

    @Override
    Boolean visitSortInputProcedurePhrase(CobolParser.SortInputProcedurePhraseContext ctx) {
        unsupported(ctx)
        //return super.visitSortInputProcedurePhrase(ctx)
    }

    @Override
    Boolean visitSortInputThrough(CobolParser.SortInputThroughContext ctx) {
        unsupported(ctx)
        //return super.visitSortInputThrough(ctx)
    }

    @Override
    Boolean visitSortUsing(CobolParser.SortUsingContext ctx) {
        unsupported(ctx)
        //return super.visitSortUsing(ctx)
    }

    @Override
    Boolean visitSortOutputProcedurePhrase(CobolParser.SortOutputProcedurePhraseContext ctx) {
        unsupported(ctx)
        //return super.visitSortOutputProcedurePhrase(ctx)
    }

    @Override
    Boolean visitSortOutputThrough(CobolParser.SortOutputThroughContext ctx) {
        unsupported(ctx)
        //return super.visitSortOutputThrough(ctx)
    }

    @Override
    Boolean visitSortGivingPhrase(CobolParser.SortGivingPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitSortGivingPhrase(ctx)
    }

    @Override
    Boolean visitSortGiving(CobolParser.SortGivingContext ctx) {
        unsupported(ctx)
        //return super.visitSortGiving(ctx)
    }

    @Override
    Boolean visitStartStatement(CobolParser.StartStatementContext ctx) {
        unsupported(ctx)
        //return super.visitStartStatement(ctx)
    }

    @Override
    Boolean visitStartKey(CobolParser.StartKeyContext ctx) {
        unsupported(ctx)
        //return super.visitStartKey(ctx)
    }

    @Override
    Boolean visitStopStatement(CobolParser.StopStatementContext ctx) {
        unsupported(ctx)
        //return super.visitStopStatement(ctx)
    }

    @Override
    Boolean visitStopStatementGiving(CobolParser.StopStatementGivingContext ctx) {
        unsupported(ctx)
        //return super.visitStopStatementGiving(ctx)
    }

    @Override
    Boolean visitStringStatement(CobolParser.StringStatementContext ctx) {
        unsupported(ctx)
        //return super.visitStringStatement(ctx)
    }

    @Override
    Boolean visitStringSendingPhrase(CobolParser.StringSendingPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitStringSendingPhrase(ctx)
    }

    @Override
    Boolean visitStringSending(CobolParser.StringSendingContext ctx) {
        unsupported(ctx)
        //return super.visitStringSending(ctx)
    }

    @Override
    Boolean visitStringDelimitedByPhrase(CobolParser.StringDelimitedByPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitStringDelimitedByPhrase(ctx)
    }

    @Override
    Boolean visitStringForPhrase(CobolParser.StringForPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitStringForPhrase(ctx)
    }

    @Override
    Boolean visitStringIntoPhrase(CobolParser.StringIntoPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitStringIntoPhrase(ctx)
    }

    @Override
    Boolean visitStringWithPointerPhrase(CobolParser.StringWithPointerPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitStringWithPointerPhrase(ctx)
    }

    @Override
    Boolean visitSubtractStatement(CobolParser.SubtractStatementContext ctx) {
        unsupported(ctx)
        //return super.visitSubtractStatement(ctx)
    }

    @Override
    Boolean visitSubtractFromStatement(CobolParser.SubtractFromStatementContext ctx) {
        unsupported(ctx)
        //return super.visitSubtractFromStatement(ctx)
    }

    @Override
    Boolean visitSubtractFromGivingStatement(CobolParser.SubtractFromGivingStatementContext ctx) {
        unsupported(ctx)
        //return super.visitSubtractFromGivingStatement(ctx)
    }

    @Override
    Boolean visitSubtractCorrespondingStatement(CobolParser.SubtractCorrespondingStatementContext ctx) {
        unsupported(ctx)
        //return super.visitSubtractCorrespondingStatement(ctx)
    }

    @Override
    Boolean visitSubtractSubtrahend(CobolParser.SubtractSubtrahendContext ctx) {
        unsupported(ctx)
        //return super.visitSubtractSubtrahend(ctx)
    }

    @Override
    Boolean visitSubtractMinuend(CobolParser.SubtractMinuendContext ctx) {
        unsupported(ctx)
        //return super.visitSubtractMinuend(ctx)
    }

    @Override
    Boolean visitSubtractMinuendGiving(CobolParser.SubtractMinuendGivingContext ctx) {
        unsupported(ctx)
        //return super.visitSubtractMinuendGiving(ctx)
    }

    @Override
    Boolean visitSubtractGiving(CobolParser.SubtractGivingContext ctx) {
        unsupported(ctx)
        //return super.visitSubtractGiving(ctx)
    }

    @Override
    Boolean visitSubtractMinuendCorresponding(CobolParser.SubtractMinuendCorrespondingContext ctx) {
        unsupported(ctx)
        //return super.visitSubtractMinuendCorresponding(ctx)
    }

    @Override
    Boolean visitTerminateStatement(CobolParser.TerminateStatementContext ctx) {
        unsupported(ctx)
        //return super.visitTerminateStatement(ctx)
    }

    @Override
    Boolean visitUnstringStatement(CobolParser.UnstringStatementContext ctx) {
        unsupported(ctx)
        //return super.visitUnstringStatement(ctx)
    }

    @Override
    Boolean visitUnstringSendingPhrase(CobolParser.UnstringSendingPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitUnstringSendingPhrase(ctx)
    }

    @Override
    Boolean visitUnstringDelimitedByPhrase(CobolParser.UnstringDelimitedByPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitUnstringDelimitedByPhrase(ctx)
    }

    @Override
    Boolean visitUnstringOrAllPhrase(CobolParser.UnstringOrAllPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitUnstringOrAllPhrase(ctx)
    }

    @Override
    Boolean visitUnstringIntoPhrase(CobolParser.UnstringIntoPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitUnstringIntoPhrase(ctx)
    }

    @Override
    Boolean visitUnstringInto(CobolParser.UnstringIntoContext ctx) {
        unsupported(ctx)
        //return super.visitUnstringInto(ctx)
    }

    @Override
    Boolean visitUnstringDelimiterIn(CobolParser.UnstringDelimiterInContext ctx) {
        unsupported(ctx)
        //return super.visitUnstringDelimiterIn(ctx)
    }

    @Override
    Boolean visitUnstringCountIn(CobolParser.UnstringCountInContext ctx) {
        unsupported(ctx)
        //return super.visitUnstringCountIn(ctx)
    }

    @Override
    Boolean visitUnstringWithPointerPhrase(CobolParser.UnstringWithPointerPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitUnstringWithPointerPhrase(ctx)
    }

    @Override
    Boolean visitUnstringTallyingPhrase(CobolParser.UnstringTallyingPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitUnstringTallyingPhrase(ctx)
    }

    @Override
    Boolean visitUseStatement(CobolParser.UseStatementContext ctx) {
        unsupported(ctx)
        //return super.visitUseStatement(ctx)
    }

    @Override
    Boolean visitUseAfterClause(CobolParser.UseAfterClauseContext ctx) {
        unsupported(ctx)
        //return super.visitUseAfterClause(ctx)
    }

    @Override
    Boolean visitUseAfterOn(CobolParser.UseAfterOnContext ctx) {
        unsupported(ctx)
        //return super.visitUseAfterOn(ctx)
    }

    @Override
    Boolean visitUseDebugClause(CobolParser.UseDebugClauseContext ctx) {
        unsupported(ctx)
        //return super.visitUseDebugClause(ctx)
    }

    @Override
    Boolean visitUseDebugOn(CobolParser.UseDebugOnContext ctx) {
        unsupported(ctx)
        //return super.visitUseDebugOn(ctx)
    }

    @Override
    Boolean visitWriteStatement(CobolParser.WriteStatementContext ctx) {
        unsupported(ctx)
        //return super.visitWriteStatement(ctx)
    }

    @Override
    Boolean visitWriteFromPhrase(CobolParser.WriteFromPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitWriteFromPhrase(ctx)
    }

    @Override
    Boolean visitWriteAdvancingPhrase(CobolParser.WriteAdvancingPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitWriteAdvancingPhrase(ctx)
    }

    @Override
    Boolean visitWriteAdvancingPage(CobolParser.WriteAdvancingPageContext ctx) {
        unsupported(ctx)
        //return super.visitWriteAdvancingPage(ctx)
    }

    @Override
    Boolean visitWriteAdvancingLines(CobolParser.WriteAdvancingLinesContext ctx) {
        unsupported(ctx)
        //return super.visitWriteAdvancingLines(ctx)
    }

    @Override
    Boolean visitWriteAdvancingMnemonic(CobolParser.WriteAdvancingMnemonicContext ctx) {
        unsupported(ctx)
        //return super.visitWriteAdvancingMnemonic(ctx)
    }

    @Override
    Boolean visitWriteAtEndOfPagePhrase(CobolParser.WriteAtEndOfPagePhraseContext ctx) {
        unsupported(ctx)
        //return super.visitWriteAtEndOfPagePhrase(ctx)
    }

    @Override
    Boolean visitWriteNotAtEndOfPagePhrase(CobolParser.WriteNotAtEndOfPagePhraseContext ctx) {
        unsupported(ctx)
        //return super.visitWriteNotAtEndOfPagePhrase(ctx)
    }

    @Override
    Boolean visitAtEndPhrase(CobolParser.AtEndPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitAtEndPhrase(ctx)
    }

    @Override
    Boolean visitNotAtEndPhrase(CobolParser.NotAtEndPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitNotAtEndPhrase(ctx)
    }

    @Override
    Boolean visitInvalidKeyPhrase(CobolParser.InvalidKeyPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitInvalidKeyPhrase(ctx)
    }

    @Override
    Boolean visitNotInvalidKeyPhrase(CobolParser.NotInvalidKeyPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitNotInvalidKeyPhrase(ctx)
    }

    @Override
    Boolean visitOnOverflowPhrase(CobolParser.OnOverflowPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitOnOverflowPhrase(ctx)
    }

    @Override
    Boolean visitNotOnOverflowPhrase(CobolParser.NotOnOverflowPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitNotOnOverflowPhrase(ctx)
    }

    @Override
    Boolean visitOnSizeErrorPhrase(CobolParser.OnSizeErrorPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitOnSizeErrorPhrase(ctx)
    }

    @Override
    Boolean visitNotOnSizeErrorPhrase(CobolParser.NotOnSizeErrorPhraseContext ctx) {
        unsupported(ctx)
        //return super.visitNotOnSizeErrorPhrase(ctx)
    }

    @Override
    Boolean visitOnExceptionClause(CobolParser.OnExceptionClauseContext ctx) {
        unsupported(ctx)
        //return super.visitOnExceptionClause(ctx)
    }

    @Override
    Boolean visitNotOnExceptionClause(CobolParser.NotOnExceptionClauseContext ctx) {
        unsupported(ctx)
        //return super.visitNotOnExceptionClause(ctx)
    }

    @Override
    Boolean visitArithmeticExpression(CobolParser.ArithmeticExpressionContext ctx) {
        unsupported(ctx)
        //return super.visitArithmeticExpression(ctx)
    }

    @Override
    Boolean visitPlusMinus(CobolParser.PlusMinusContext ctx) {
        unsupported(ctx)
        //return super.visitPlusMinus(ctx)
    }

    @Override
    Boolean visitMultDivs(CobolParser.MultDivsContext ctx) {
        unsupported(ctx)
        //return super.visitMultDivs(ctx)
    }

    @Override
    Boolean visitMultDiv(CobolParser.MultDivContext ctx) {
        unsupported(ctx)
        //return super.visitMultDiv(ctx)
    }

    @Override
    Boolean visitPowers(CobolParser.PowersContext ctx) {
        unsupported(ctx)
        //return super.visitPowers(ctx)
    }

    @Override
    Boolean visitPower(CobolParser.PowerContext ctx) {
        unsupported(ctx)
        //return super.visitPower(ctx)
    }

    @Override
    Boolean visitBasis(CobolParser.BasisContext ctx) {
        unsupported(ctx)
        //return super.visitBasis(ctx)
    }

    @Override
    Boolean visitCondition(CobolParser.ConditionContext ctx) {
        unsupported(ctx)
        //return super.visitCondition(ctx)
    }

    @Override
    Boolean visitAndOrCondition(CobolParser.AndOrConditionContext ctx) {
        unsupported(ctx)
        //return super.visitAndOrCondition(ctx)
    }

    @Override
    Boolean visitCombinableCondition(CobolParser.CombinableConditionContext ctx) {
        unsupported(ctx)
        //return super.visitCombinableCondition(ctx)
    }

    @Override
    Boolean visitSimpleCondition(CobolParser.SimpleConditionContext ctx) {
        unsupported(ctx)
        //return super.visitSimpleCondition(ctx)
    }

    @Override
    Boolean visitClassCondition(CobolParser.ClassConditionContext ctx) {
        unsupported(ctx)
        //return super.visitClassCondition(ctx)
    }

    @Override
    Boolean visitConditionNameReference(CobolParser.ConditionNameReferenceContext ctx) {
        unsupported(ctx)
        //return super.visitConditionNameReference(ctx)
    }

    @Override
    Boolean visitConditionNameSubscriptReference(CobolParser.ConditionNameSubscriptReferenceContext ctx) {
        unsupported(ctx)
        //return super.visitConditionNameSubscriptReference(ctx)
    }

    @Override
    Boolean visitRelationCondition(CobolParser.RelationConditionContext ctx) {
        unsupported(ctx)
        //return super.visitRelationCondition(ctx)
    }

    @Override
    Boolean visitRelationSignCondition(CobolParser.RelationSignConditionContext ctx) {
        unsupported(ctx)
        //return super.visitRelationSignCondition(ctx)
    }

    @Override
    Boolean visitRelationArithmeticComparison(CobolParser.RelationArithmeticComparisonContext ctx) {
        unsupported(ctx)
        //return super.visitRelationArithmeticComparison(ctx)
    }

    @Override
    Boolean visitRelationCombinedComparison(CobolParser.RelationCombinedComparisonContext ctx) {
        unsupported(ctx)
        //return super.visitRelationCombinedComparison(ctx)
    }

    @Override
    Boolean visitRelationCombinedCondition(CobolParser.RelationCombinedConditionContext ctx) {
        unsupported(ctx)
        //return super.visitRelationCombinedCondition(ctx)
    }

    @Override
    Boolean visitRelationalOperator(CobolParser.RelationalOperatorContext ctx) {
        unsupported(ctx)
        //return super.visitRelationalOperator(ctx)
    }

    @Override
    Boolean visitAbbreviation(CobolParser.AbbreviationContext ctx) {
        unsupported(ctx)
        //return super.visitAbbreviation(ctx)
    }

    @Override
    Boolean visitIdentifier(CobolParser.IdentifierContext ctx) {
        unsupported(ctx)
        //return super.visitIdentifier(ctx)
    }

    @Override
    Boolean visitTableCall(CobolParser.TableCallContext ctx) {
        unsupported(ctx)
        //return super.visitTableCall(ctx)
    }

    @Override
    Boolean visitFunctionCall(CobolParser.FunctionCallContext ctx) {
        unsupported(ctx)
        //return super.visitFunctionCall(ctx)
    }

    @Override
    Boolean visitReferenceModifier(CobolParser.ReferenceModifierContext ctx) {
        unsupported(ctx)
        //return super.visitReferenceModifier(ctx)
    }

    @Override
    Boolean visitCharacterPosition(CobolParser.CharacterPositionContext ctx) {
        unsupported(ctx)
        //return super.visitCharacterPosition(ctx)
    }

    @Override
    Boolean visitLength(CobolParser.LengthContext ctx) {
        unsupported(ctx)
        //return super.visitLength(ctx)
    }

    @Override
    Boolean visitSubscript(CobolParser.SubscriptContext ctx) {
        unsupported(ctx)
        //return super.visitSubscript(ctx)
    }

    @Override
    Boolean visitArgument(CobolParser.ArgumentContext ctx) {
        unsupported(ctx)
        //return super.visitArgument(ctx)
    }

    @Override
    Boolean visitQualifiedDataName(CobolParser.QualifiedDataNameContext ctx) {
        unsupported(ctx)
        //return super.visitQualifiedDataName(ctx)
    }

    @Override
    Boolean visitQualifiedDataNameFormat1(CobolParser.QualifiedDataNameFormat1Context ctx) {
        unsupported(ctx)
        //return super.visitQualifiedDataNameFormat1(ctx)
    }

    @Override
    Boolean visitQualifiedDataNameFormat2(CobolParser.QualifiedDataNameFormat2Context ctx) {
        unsupported(ctx)
        //return super.visitQualifiedDataNameFormat2(ctx)
    }

    @Override
    Boolean visitQualifiedDataNameFormat3(CobolParser.QualifiedDataNameFormat3Context ctx) {
        unsupported(ctx)
        //return super.visitQualifiedDataNameFormat3(ctx)
    }

    @Override
    Boolean visitQualifiedDataNameFormat4(CobolParser.QualifiedDataNameFormat4Context ctx) {
        unsupported(ctx)
        //return super.visitQualifiedDataNameFormat4(ctx)
    }

    @Override
    Boolean visitQualifiedInData(CobolParser.QualifiedInDataContext ctx) {
        unsupported(ctx)
        //return super.visitQualifiedInData(ctx)
    }

    @Override
    Boolean visitInData(CobolParser.InDataContext ctx) {
        unsupported(ctx)
        //return super.visitInData(ctx)
    }

    @Override
    Boolean visitInFile(CobolParser.InFileContext ctx) {
        unsupported(ctx)
        //return super.visitInFile(ctx)
    }

    @Override
    Boolean visitInMnemonic(CobolParser.InMnemonicContext ctx) {
        unsupported(ctx)
        //return super.visitInMnemonic(ctx)
    }

    @Override
    Boolean visitInSection(CobolParser.InSectionContext ctx) {
        unsupported(ctx)
        //return super.visitInSection(ctx)
    }

    @Override
    Boolean visitInLibrary(CobolParser.InLibraryContext ctx) {
        unsupported(ctx)
        //return super.visitInLibrary(ctx)
    }

    @Override
    Boolean visitInTable(CobolParser.InTableContext ctx) {
        unsupported(ctx)
        //return super.visitInTable(ctx)
    }

    @Override
    Boolean visitAlphabetName(CobolParser.AlphabetNameContext ctx) {
        unsupported(ctx)
        //return super.visitAlphabetName(ctx)
    }

    @Override
    Boolean visitAssignmentName(CobolParser.AssignmentNameContext ctx) {
        unsupported(ctx)
        //return super.visitAssignmentName(ctx)
    }

    @Override
    Boolean visitBasisName(CobolParser.BasisNameContext ctx) {
        unsupported(ctx)
        //return super.visitBasisName(ctx)
    }

    @Override
    Boolean visitCdName(CobolParser.CdNameContext ctx) {
        unsupported(ctx)
        //return super.visitCdName(ctx)
    }

    @Override
    Boolean visitClassName(CobolParser.ClassNameContext ctx) {
        unsupported(ctx)
        //return super.visitClassName(ctx)
    }

    @Override
    Boolean visitComputerName(CobolParser.ComputerNameContext ctx) {
        unsupported(ctx)
        //return super.visitComputerName(ctx)
    }

    @Override
    Boolean visitDataDescName(CobolParser.DataDescNameContext ctx) {
        unsupported(ctx)
        //return super.visitDataDescName(ctx)
    }

    @Override
    Boolean visitEnvironmentName(CobolParser.EnvironmentNameContext ctx) {
        unsupported(ctx)
        //return super.visitEnvironmentName(ctx)
    }

    @Override
    Boolean visitFileName(CobolParser.FileNameContext ctx) {
        unsupported(ctx)
        //return super.visitFileName(ctx)
    }

    @Override
    Boolean visitFunctionName(CobolParser.FunctionNameContext ctx) {
        unsupported(ctx)
        //return super.visitFunctionName(ctx)
    }

    @Override
    Boolean visitLanguageName(CobolParser.LanguageNameContext ctx) {
        unsupported(ctx)
        //return super.visitLanguageName(ctx)
    }

    @Override
    Boolean visitLibraryName(CobolParser.LibraryNameContext ctx) {
        unsupported(ctx)
        //return super.visitLibraryName(ctx)
    }

    @Override
    Boolean visitLocalName(CobolParser.LocalNameContext ctx) {
        unsupported(ctx)
        //return super.visitLocalName(ctx)
    }

    @Override
    Boolean visitMnemonicName(CobolParser.MnemonicNameContext ctx) {
        unsupported(ctx)
        //return super.visitMnemonicName(ctx)
    }

    @Override
    Boolean visitParagraphName(CobolParser.ParagraphNameContext ctx) {
        unsupported(ctx)
        //return super.visitParagraphName(ctx)
    }

    @Override
    Boolean visitProcedureName(CobolParser.ProcedureNameContext ctx) {
        unsupported(ctx)
        //return super.visitProcedureName(ctx)
    }

    @Override
    Boolean visitRecordName(CobolParser.RecordNameContext ctx) {
        unsupported(ctx)
        //return super.visitRecordName(ctx)
    }

    @Override
    Boolean visitReportName(CobolParser.ReportNameContext ctx) {
        unsupported(ctx)
        //return super.visitReportName(ctx)
    }

    @Override
    Boolean visitRoutineName(CobolParser.RoutineNameContext ctx) {
        unsupported(ctx)
        //return super.visitRoutineName(ctx)
    }

    @Override
    Boolean visitScreenName(CobolParser.ScreenNameContext ctx) {
        unsupported(ctx)
        //return super.visitScreenName(ctx)
    }

    @Override
    Boolean visitSectionName(CobolParser.SectionNameContext ctx) {
        unsupported(ctx)
        //return super.visitSectionName(ctx)
    }

    @Override
    Boolean visitSystemName(CobolParser.SystemNameContext ctx) {
        unsupported(ctx)
        //return super.visitSystemName(ctx)
    }

    @Override
    Boolean visitSymbolicCharacter(CobolParser.SymbolicCharacterContext ctx) {
        unsupported(ctx)
        //return super.visitSymbolicCharacter(ctx)
    }

    @Override
    Boolean visitTextName(CobolParser.TextNameContext ctx) {
        unsupported(ctx)
        //return super.visitTextName(ctx)
    }

    @Override
    Boolean visitBooleanLiteral(CobolParser.BooleanLiteralContext ctx) {
        unsupported(ctx)
        //return super.visitBooleanLiteral(ctx)
    }

    @Override
    Boolean visitNumericLiteral(CobolParser.NumericLiteralContext ctx) {
        unsupported(ctx)
        //return super.visitNumericLiteral(ctx)
    }

    @Override
    Boolean visitCicsDfhRespLiteral(CobolParser.CicsDfhRespLiteralContext ctx) {
        unsupported(ctx)
        //return super.visitCicsDfhRespLiteral(ctx)
    }

    @Override
    Boolean visitCicsDfhValueLiteral(CobolParser.CicsDfhValueLiteralContext ctx) {
        unsupported(ctx)
        //return super.visitCicsDfhValueLiteral(ctx)
    }

    @Override
    Boolean visitSpecialRegister(CobolParser.SpecialRegisterContext ctx) {
        unsupported(ctx)
        //return super.visitSpecialRegister(ctx)
    }

    @Override
    Boolean visitCommentEntry(CobolParser.CommentEntryContext ctx) {
        unsupported(ctx)
        //return super.visitCommentEntry(ctx)
    }
}
