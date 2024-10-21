// This is a generated file. Not intended for manual editing.
package org.hnisula.cpp2plugin.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;
import org.hnisula.cpp2plugin.Cpp2Reference;
import org.hnisula.cpp2plugin.Cpp2NamedDeclaration;
import org.hnisula.cpp2plugin.Cpp2Scope;

public class Cpp2Visitor extends PsiElementVisitor {

  public void visitAddExpr(@NotNull Cpp2AddExpr o) {
    visitExpr(o);
  }

  public void visitAddressExpr(@NotNull Cpp2AddressExpr o) {
    visitExpr(o);
  }

  public void visitAndExpr(@NotNull Cpp2AndExpr o) {
    visitExpr(o);
  }

  public void visitArg(@NotNull Cpp2Arg o) {
    visitPsiElement(o);
  }

  public void visitAssign(@NotNull Cpp2Assign o) {
    visitPsiElement(o);
  }

  public void visitBitAndExpr(@NotNull Cpp2BitAndExpr o) {
    visitExpr(o);
  }

  public void visitBitNotExpr(@NotNull Cpp2BitNotExpr o) {
    visitExpr(o);
  }

  public void visitBitOrExpr(@NotNull Cpp2BitOrExpr o) {
    visitExpr(o);
  }

  public void visitBitXorExpr(@NotNull Cpp2BitXorExpr o) {
    visitExpr(o);
  }

  public void visitCaptureExpr(@NotNull Cpp2CaptureExpr o) {
    visitExpr(o);
  }

  public void visitChainCompareExpr(@NotNull Cpp2ChainCompareExpr o) {
    visitExpr(o);
  }

  public void visitConstexprDecl(@NotNull Cpp2ConstexprDecl o) {
    visitPsiElement(o);
  }

  public void visitDecrementExpr(@NotNull Cpp2DecrementExpr o) {
    visitExpr(o);
  }

  public void visitDerefExpr(@NotNull Cpp2DerefExpr o) {
    visitExpr(o);
  }

  public void visitDivExpr(@NotNull Cpp2DivExpr o) {
    visitExpr(o);
  }

  public void visitDoWhileLoop(@NotNull Cpp2DoWhileLoop o) {
    visitPsiElement(o);
  }

  public void visitExpr(@NotNull Cpp2Expr o) {
    visitPsiElement(o);
  }

  public void visitFileWrapper(@NotNull Cpp2FileWrapper o) {
    visitScope(o);
  }

  public void visitForLoop(@NotNull Cpp2ForLoop o) {
    visitPsiElement(o);
  }

  public void visitFuncAliasDecl(@NotNull Cpp2FuncAliasDecl o) {
    visitPsiElement(o);
  }

  public void visitFuncCall(@NotNull Cpp2FuncCall o) {
    visitExpr(o);
  }

  public void visitFuncDecl(@NotNull Cpp2FuncDecl o) {
    visitNamedDeclaration(o);
    // visitScope(o);
  }

  public void visitIdentifier(@NotNull Cpp2Identifier o) {
    visitReference(o);
  }

  public void visitIfBranch(@NotNull Cpp2IfBranch o) {
    visitPsiElement(o);
  }

  public void visitIncrementExpr(@NotNull Cpp2IncrementExpr o) {
    visitExpr(o);
  }

  public void visitLambdaDecl(@NotNull Cpp2LambdaDecl o) {
    visitExpr(o);
  }

  public void visitLeftShiftExpr(@NotNull Cpp2LeftShiftExpr o) {
    visitExpr(o);
  }

  public void visitListExpr(@NotNull Cpp2ListExpr o) {
    visitExpr(o);
  }

  public void visitLiteral(@NotNull Cpp2Literal o) {
    visitExpr(o);
  }

  public void visitMathAssign(@NotNull Cpp2MathAssign o) {
    visitPsiElement(o);
  }

  public void visitMemberAccessExpr(@NotNull Cpp2MemberAccessExpr o) {
    visitExpr(o);
  }

  public void visitMemberAccessLevel(@NotNull Cpp2MemberAccessLevel o) {
    visitPsiElement(o);
  }

  public void visitMemberDecl(@NotNull Cpp2MemberDecl o) {
    visitPsiElement(o);
  }

  public void visitModExpr(@NotNull Cpp2ModExpr o) {
    visitExpr(o);
  }

  public void visitMulExpr(@NotNull Cpp2MulExpr o) {
    visitExpr(o);
  }

  public void visitNamespaceAliasDecl(@NotNull Cpp2NamespaceAliasDecl o) {
    visitPsiElement(o);
  }

  public void visitNamespaceDecl(@NotNull Cpp2NamespaceDecl o) {
    visitNamedDeclaration(o);
    // visitScope(o);
  }

  public void visitNextStmt(@NotNull Cpp2NextStmt o) {
    visitPsiElement(o);
  }

  public void visitNotExpr(@NotNull Cpp2NotExpr o) {
    visitExpr(o);
  }

  public void visitOrExpr(@NotNull Cpp2OrExpr o) {
    visitExpr(o);
  }

  public void visitParam(@NotNull Cpp2Param o) {
    visitPsiElement(o);
  }

  public void visitParamList(@NotNull Cpp2ParamList o) {
    visitPsiElement(o);
  }

  public void visitParenExpr(@NotNull Cpp2ParenExpr o) {
    visitExpr(o);
  }

  public void visitQIdentifier(@NotNull Cpp2QIdentifier o) {
    visitExpr(o);
  }

  public void visitReturnStmt(@NotNull Cpp2ReturnStmt o) {
    visitPsiElement(o);
  }

  public void visitReturnType(@NotNull Cpp2ReturnType o) {
    visitPsiElement(o);
  }

  public void visitRightShiftExpr(@NotNull Cpp2RightShiftExpr o) {
    visitExpr(o);
  }

  public void visitRootStmtBlock(@NotNull Cpp2RootStmtBlock o) {
    visitPsiElement(o);
  }

  public void visitRootStmts(@NotNull Cpp2RootStmts o) {
    visitPsiElement(o);
  }

  public void visitStmtBlock(@NotNull Cpp2StmtBlock o) {
    visitPsiElement(o);
  }

  public void visitSubExpr(@NotNull Cpp2SubExpr o) {
    visitExpr(o);
  }

  public void visitSubscriptExpr(@NotNull Cpp2SubscriptExpr o) {
    visitExpr(o);
  }

  public void visitTemplate(@NotNull Cpp2Template o) {
    visitPsiElement(o);
  }

  public void visitTemplateDecl(@NotNull Cpp2TemplateDecl o) {
    visitPsiElement(o);
  }

  public void visitThisParam(@NotNull Cpp2ThisParam o) {
    visitPsiElement(o);
  }

  public void visitTypeAliasDecl(@NotNull Cpp2TypeAliasDecl o) {
    visitPsiElement(o);
  }

  public void visitTypeDecl(@NotNull Cpp2TypeDecl o) {
    visitNamedDeclaration(o);
    // visitScope(o);
  }

  public void visitTypeSpecifier(@NotNull Cpp2TypeSpecifier o) {
    visitPsiElement(o);
  }

  public void visitUnaryMinusExpr(@NotNull Cpp2UnaryMinusExpr o) {
    visitExpr(o);
  }

  public void visitUnaryPlusExpr(@NotNull Cpp2UnaryPlusExpr o) {
    visitExpr(o);
  }

  public void visitUsingNamespace(@NotNull Cpp2UsingNamespace o) {
    visitPsiElement(o);
  }

  public void visitValueDecl(@NotNull Cpp2ValueDecl o) {
    visitNamedDeclaration(o);
  }

  public void visitVariadicParam(@NotNull Cpp2VariadicParam o) {
    visitPsiElement(o);
  }

  public void visitWhileLoop(@NotNull Cpp2WhileLoop o) {
    visitPsiElement(o);
  }

  public void visitNamedDeclaration(@NotNull Cpp2NamedDeclaration o) {
    visitPsiElement(o);
  }

  public void visitReference(@NotNull Cpp2Reference o) {
    visitPsiElement(o);
  }

  public void visitScope(@NotNull Cpp2Scope o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
