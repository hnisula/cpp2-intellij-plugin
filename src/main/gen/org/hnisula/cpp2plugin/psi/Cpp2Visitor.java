// This is a generated file. Not intended for manual editing.
package org.hnisula.cpp2plugin.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class Cpp2Visitor extends PsiElementVisitor {

  public void visitAddExpr(@NotNull Cpp2AddExpr o) {
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

  public void visitBitOrExpr(@NotNull Cpp2BitOrExpr o) {
    visitExpr(o);
  }

  public void visitBitXorExpr(@NotNull Cpp2BitXorExpr o) {
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

  public void visitEqExpr(@NotNull Cpp2EqExpr o) {
    visitExpr(o);
  }

  public void visitExpr(@NotNull Cpp2Expr o) {
    visitPsiElement(o);
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
    visitPsiElement(o);
  }

  public void visitGtExpr(@NotNull Cpp2GtExpr o) {
    visitExpr(o);
  }

  public void visitGteqExpr(@NotNull Cpp2GteqExpr o) {
    visitExpr(o);
  }

  public void visitIdentifier(@NotNull Cpp2Identifier o) {
    visitExpr(o);
  }

  public void visitIfBranch(@NotNull Cpp2IfBranch o) {
    visitPsiElement(o);
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

  public void visitLtExpr(@NotNull Cpp2LtExpr o) {
    visitExpr(o);
  }

  public void visitLteqExpr(@NotNull Cpp2LteqExpr o) {
    visitExpr(o);
  }

  public void visitMemberAccess(@NotNull Cpp2MemberAccess o) {
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
    visitPsiElement(o);
  }

  public void visitNeqExpr(@NotNull Cpp2NeqExpr o) {
    visitExpr(o);
  }

  public void visitNextStmt(@NotNull Cpp2NextStmt o) {
    visitPsiElement(o);
  }

  public void visitObjAliasDecl(@NotNull Cpp2ObjAliasDecl o) {
    visitPsiElement(o);
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

  public void visitReturnType(@NotNull Cpp2ReturnType o) {
    visitPsiElement(o);
  }

  public void visitRightShiftExpr(@NotNull Cpp2RightShiftExpr o) {
    visitExpr(o);
  }

  public void visitRootStmt(@NotNull Cpp2RootStmt o) {
    visitPsiElement(o);
  }

  public void visitScope(@NotNull Cpp2Scope o) {
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
    visitPsiElement(o);
  }

  public void visitTypeSpecifier(@NotNull Cpp2TypeSpecifier o) {
    visitPsiElement(o);
  }

  public void visitUsingNamespace(@NotNull Cpp2UsingNamespace o) {
    visitPsiElement(o);
  }

  public void visitValueDecl(@NotNull Cpp2ValueDecl o) {
    visitPsiDeclaration(o);
  }

  public void visitVariadicParam(@NotNull Cpp2VariadicParam o) {
    visitPsiElement(o);
  }

  public void visitWhileLoop(@NotNull Cpp2WhileLoop o) {
    visitPsiElement(o);
  }

  public void visitPsiDeclaration(@NotNull Cpp2PsiDeclaration o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
